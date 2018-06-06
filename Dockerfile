FROM openjdk:8-jre-alpine

RUN mkdir /usr/local/bin
ADD target/spring-rest-0.0.1-SNAPSHOT.jar 