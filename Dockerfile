FROM amazoncorretto:17
MAINTAINER GonzaMG
COPY target/gmg-0.0.1-SNAPSHOT.jar gmg-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/gmg-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080
