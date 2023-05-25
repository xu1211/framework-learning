
1. 创建Maven项目,引入protobuf 与grpc相关依赖
```xml
        <dependency>
            <groupId>com.google.protobuf</groupId>
            <artifactId>protobuf-java</artifactId>
            <version>${protobuf.version}</version>
        </dependency>

        <!-- gRPC dependencies -->
        <dependency>
            <groupId>io.grpc</groupId>
            <artifactId>grpc-netty-shaded</artifactId>
            <version>${grpc.version}</version>
        </dependency>

        <dependency>
            <groupId>io.grpc</groupId>
            <artifactId>grpc-protobuf</artifactId>
            <version>${grpc.version}</version>
        </dependency>

        <dependency>
            <groupId>io.grpc</groupId>
            <artifactId>grpc-stub</artifactId>
            <version>${grpc.version}</version>
        </dependency>
```
2. 在src/main目录下创建proto文件夹, 写proto文件

   文件中要指定`option java_package`与`option java_outer_classname `
   
   如: [helloword.proto](./src/main/proto/helloword.proto)

3. pom引入 生成proto的编译插件
```xml
<plugins>
    <plugin>
        <groupId>org.xolstice.maven.plugins</groupId>
        <artifactId>protobuf-maven-plugin</artifactId>
        <version>0.6.1</version>
        <configuration>
            <protocArtifact>com.google.protobuf:protoc:${protoc.version}:exe:${os.detected.classifier}</protocArtifact>
            <pluginId>grpc-java</pluginId>
            <pluginArtifact>io.grpc:protoc-gen-grpc-java:${grpc.version}:exe:${os.detected.classifier}</pluginArtifact>
        </configuration>
        <executions>
            <execution>
                <goals>
                    <goal>compile</goal>
                    <goal>compile-custom</goal>
                </goals>
            </execution>
        </executions>
    </plugin>
</plugins>
```
4. 运行插件生成代码
  - 执行插件: `Plugins/protobuf/protobuf:compile` 与 `Plugins/protobuf/protobuf:custom`
  - 或直接编译 : `Lifecycle/compile`

会在target生成代码:
```
|- target
|- |- grnerated-sources
|- |- |- protobuf
|- |- |- |- grpc-java
|- |- |- |- |- {java_package}/{service_name}Grpc
|- |- |- |- java
|- |- |- |- |- {java_package}/{java_outer_classname}
```
5. 把 protobuf下的 grpc-java 与java目录 设置成`Generated Sources Root`

报错:`Cannot resolve symbol 'UnusedPrivateParameter'`是由于protobuf-java版本低原因, 更新版本重新编译
6. 开发grpc服务的server 与 client; 

在代码中引用编译生产的类, 调用它的方法实现grpc
```java
import com.examples.grpc.*;
```

7. 启动server服务

8. 启动client服务调用server

