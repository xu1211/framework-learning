#!/bin/bash

#日志输出目录
LOGPATH=/app/log/

#创建服务的日志目录
mkdir -p ${LOGPATH}

#创建日志目录的软链
ln -s ${LOGPATH} log

# 启动服务
java -XX:+PrintGCDateStamps -XX:+PrintGCDetails -verbose:gc -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=8 -XX:GCLogFileSize=50M -jar ${jar}