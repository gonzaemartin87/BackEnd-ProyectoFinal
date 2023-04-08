FROM amazoncorretto:17-alpine-jdk
MAINTAINER GonzaMG
COPY target/gmg-0.0.1-SNAPSHOT.jar gmg-app.jar
ENTRYPOINT ["java", "-jar", "/gmg-app.jar"]
EXPOSE 8080
