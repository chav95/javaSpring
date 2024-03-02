FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ./target/movies-0.0.1-SNAPSHOT.jar app.jar
LABEL authors="chav95"

ENTRYPOINT ["java", "-jar", "/app.jar"]