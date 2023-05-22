# docker包目录结构
# --- app
#   |-- log  日志输出目录
#   |-- xxx.jar 服务jar
#   |-- entrypoint.sh  服务启动脚本
#   |-- stop.sh   服务停止脚本
#

FROM centos
# RUN echo "ip_resolve=4" >> /etc/yum.conf

# 设置时区。这对于日志、调用链等功能非常重要。
RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo "Asia/Shanghai" > /etc/timezone

# 设置环境变量
ENV workdir /app/
ENV jar kafka-0.0.1-SNAPSHOT.jar

# 拷贝应用 jar 包
COPY ./artifact/kafka-0.0.1-SNAPSHOT.jar ${workdir}
WORKDIR ${workdir}

# 拷贝entrypoint.sh并修改权限
COPY ./entrypoint.sh /app/entrypoint.sh
RUN ["chmod", "+x", "/app/entrypoint.sh"]

# 启动entrypoint.sh
ENTRYPOINT ["sh", "-c", "./entrypoint.sh"]
