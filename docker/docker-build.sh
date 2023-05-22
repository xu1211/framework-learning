# 构建镜像
docker build -t ${name}:${TAG} -f Dockerfile .
#docker build -t demo/kafka:v1 -f Dockerfile .

# 上传镜像到仓库
docker login --username=${DOCKER_USER} -p ${DOCKER_PWD} ${DOCKER_HUB}

docker push  ${DOCKER_HUB}/${DOCKER_NAME}:${TAG}

docker logout