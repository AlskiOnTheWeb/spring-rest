FROM openjdk:8-jre-alpine
RUN apk --update add ca-certificates
RUN mkdir -p /usr/share/spring-rest
ADD target/spring-rest-0.0.1-SNAPSHOT.jar /usr/share/spring-rest/spring-rest.jar
CMD ["java", "-jar", "/usr/share/spring-rest/spring-rest.jar"]