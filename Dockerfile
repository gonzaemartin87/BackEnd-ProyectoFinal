FROM amazoncorretto:11-alpine-jdk
MAINTAINER GonzaMG
COPY target/gmg-0.0.1-SNAPSHOT.jar gmg-app.jar
ENTRYPOINT ["java", "-jar", "/gmg-app.jar"]  
