FROM openjdk:17
EXPOSE 8080
ADD target/Spring-Docker.jar Spring-Docker.jar
ENTRYPOINT [ "java","-jar","Spring-Docker.jar" ]