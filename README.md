# commands

# check docker images
docker images

# Docker
----------------------------------------------
FROM openjdk:17
EXPOSE 9090
ADD target/docker-demo-test.jar docker-demo-test.jar
ENTRYPOINT ["java","-jar","/docker-demo-test.jar"]

# docker spring boot
--------------------------------------------
1. docker build -t docker-image-name
2. docker tag docker-demo-test-image amirrahi29/docker-demo-test-image:docker-demo-test-image
3. docker push amirrahi29/docker-demo-test-image:docker-demo-test-image

# AWS
---------------------------------------------
1. sudo yum install docker
2. sudo systemctl status docker
3. sudo systemctl start docker
4. sudo systemctl enable docker
5. docker --version
6. sudo yum install docker
7. sudo apt-get install docker.io
8. sudo docker run -p 8080:8080 amirrahi29/docker-demo-test
9. sudo usermod -aG docker $USER
10. sudo journalctl -u docker
11. sudo docker pull amirrahi29/docker-demo-test:docker-demo-test
12. sudo docker run -p 8080:8080 amirrahi29/docker-demo-test:docker-demo-test


