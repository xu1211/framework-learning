package com.example.grpc;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import com.examples.grpc.*;

import java.util.concurrent.TimeUnit;

/**
 * @author cosmoxu
 * @version client, v 0.1 2023/5/25 15:37
 */
public class client {
    private final hellowordGrpc.hellowordBlockingStub blockingStub;

    public client(Channel channel) {
        blockingStub = hellowordGrpc.newBlockingStub(channel);
    }

    private void greet(String name) {
        System.out.println("打招呼 " + name + " ...");
        // 调用grpc方法sayHello
        Helloword.helloRequest request = Helloword.helloRequest.newBuilder()
                .setName(name)
                .setPassword(123456)
                .build();
        Helloword.helloResponse response = blockingStub.sayHello(request);
        // 返回数据
        System.out.println("get grpc server err:" + response.getError());
        System.out.println("get grpc server message:" + response.getMessage());
    }

    public static void main(String[] args) throws InterruptedException {
        // 构建 服务channel
        String host = "localhost";
        int port = 50051;
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        try {
            // 获取 blockingStub
            client client = new client(channel);

            // 调用方法
            String name = "world";
            client.greet(name);
        } finally {
            // 关闭 服务channel
            channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
        }
    }
}
