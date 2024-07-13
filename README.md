# commands

# check docker images
docker images

# push docker image on docker hub
1. docker tag docker-demo-test-image amirrahi29/docker-demo-test-image:docker-demo-test-image
2. docker push amirrahi29/docker-demo-test-image:docker-demo-test-image

# push on docker desktop
docker build -t docker-demo-test-image .

# run docker image
docker run -p 9090:8080 docker-demo-test-image
