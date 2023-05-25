
# kafka使用
./kafka

consumer

producer

# 编译docker镜像
1. 先执行 [./build.sh](./build.sh) 生成应用jar包

2. 执行 [./docker/docker-build.sh](./docker/docker-build.sh) , 会按照[./docker/Dockerfile](./docker/Dockerfile) 将jar包生成镜像

# grpc
java实现grpc调用

[./grpc](./grpc)
