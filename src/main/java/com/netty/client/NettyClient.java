package com.netty.client;

import com.netty.client.handler.IdleClientHandler;
import com.netty.client.handler.LogicClientHandler;
import com.netty.common.protobuf.Message.MessageBase;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;
import io.netty.handler.timeout.IdleStateHandler;
import org.apache.log4j.Logger;

import java.util.concurrent.TimeUnit;

/**
 * netty客户端
 *
 * @author lenovo
 */
public class NettyClient {
    private Logger log = Logger.getLogger(this.getClass());

    private final static String HOST = "127.0.0.1";
    private final static int PORT = 8090;
    private final static int READER_IDLE_TIME_SECONDS = 20;//读操作空闲20秒
    private final static int WRITER_IDLE_TIME_SECONDS = 20;//写操作空闲20秒
    private final static int ALL_IDLE_TIME_SECONDS = 40;//读写全部空闲40秒

    private NioEventLoopGroup workerGroup = new NioEventLoopGroup(4);
    private Channel channel;
    private Bootstrap b;
    private int tryTimes = 0;


    public static void main(String[] args) throws Exception {
        NettyClient client = new NettyClient();
        client.connect(HOST, PORT);
    }

    public void connect(String host, int port) throws Exception {

        try {
            b = new Bootstrap();
            b.group(workerGroup);
            b.channel(NioSocketChannel.class);
            b.option(ChannelOption.SO_KEEPALIVE, true);
            b.handler(new ChannelInitializer<SocketChannel>() {
                @Override
                public void initChannel(SocketChannel ch) throws Exception {
                    ChannelPipeline p = ch.pipeline();

                    p.addLast("idleStateHandler", new IdleStateHandler(READER_IDLE_TIME_SECONDS
                            , WRITER_IDLE_TIME_SECONDS, ALL_IDLE_TIME_SECONDS, TimeUnit.SECONDS));
                    p.addLast("idleTimeoutHandler", new IdleClientHandler(NettyClient.this));

                    p.addLast(new ProtobufVarint32FrameDecoder());
                    p.addLast(new ProtobufDecoder(MessageBase.getDefaultInstance()));

                    p.addLast(new ProtobufVarint32LengthFieldPrepender());
                    p.addLast(new ProtobufEncoder());

                    p.addLast("clientHandler", new LogicClientHandler());
                }
            });
            doConnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 重连，连接失败10秒后重试连接
     */
    public void doConnect() {

        if (channel != null && channel.isActive()) {
            return;
        }
        tryTimes++;
        log.info(tryTimes);
        ChannelFuture future = b.connect(HOST, PORT);

        future.addListener(new ChannelFutureListener() {
            public void operationComplete(ChannelFuture futureListener) throws Exception {

                if (futureListener.isSuccess()) {
                    channel = futureListener.channel();
                    channel.closeFuture();
                    workerGroup.shutdownGracefully();
                    log.info("Connect to server successfully!");
                } else {
                    log.warn("Failed to connect to server, try connect after 10s");
                    futureListener.channel().eventLoop().schedule(() -> doConnect(), 10, TimeUnit.SECONDS);
                }
            }
        });
    }
}
