#!/bin/bash

# 打包项目jar包
mvn -DskipTests=true package

# jar包放至docker目录
mv ./kafka/target/kafka-0.0.1-SNAPSHOT.jar ./docker/artifact/kafka-0.0.1-SNAPSHOT.jar

# 编译镜像
./docker/docker-build.sh