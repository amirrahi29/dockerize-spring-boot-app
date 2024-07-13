FROM openjdk:17
EXPOSE 9090
ADD target/docker-demo-test.jar docker-demo-test.jar
ENTRYPOINT ["java","-jar","/docker-demo-test.jar"]