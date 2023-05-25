package com.example.grpc;

/**
 * @author cosmoxu
 * @version server, v 0.1 2023/5/25 11:11
 */

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import com.examples.grpc.*;
import io.grpc.stub.StreamObserver;

public class server {
    private Server server;

    private void start() throws IOException {
        int port = 50051;
        server = ServerBuilder.forPort(port)
                .addService(new hellowordImpl())
                .build()
                .start();
        System.out.println("grpc server 启动! listening on: "+ port);

        // 停止服务
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** 由于JVM正在关闭, 关闭gRPC服务器");
                try {
                    server.this.stop();
                } catch (InterruptedException e) {
                    e.printStackTrace(System.err);
                }
                System.err.println("*** server 已关闭");
            }
        });
    }

    private void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    // 实现grpc方法
    static class hellowordImpl extends hellowordGrpc.hellowordImplBase {
        @Override
        public void sayHello(Helloword.helloRequest req, StreamObserver<Helloword.helloResponse> responseObserver) {
            System.out.println("接收到请求信息: " + req);
            Helloword.helloResponse reply = Helloword.helloResponse.newBuilder().setMessage("Hello " + req.getName()).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
            System.out.println("sayHello完成！");
        }
    }

    // main启动server
    public static void main(String[] args) throws IOException, InterruptedException {
        final server server = new server();
        server.start();
        server.blockUntilShutdown();
    }
}
