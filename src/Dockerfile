FROM openjdk:17-jdk-slim

WORKDIR /

COPY mvnw .
COPY mvnw.cmd .
COPY pom.xml .
COPY .mvn .mvn/
COPY src ./src/

RUN chmod +x ./mvnw
RUN ./mvnw dependency:go-offline
RUN ./mvnw package -DskipTests

# Set environment variables
ARG JAR_FILE_NAME=ecc-1.1.0-SNAPSHOT.jar
ENV JAR_FILE_NAME=$JAR_FILE_NAME

EXPOSE 8080

CMD ["sh", "-c", "java -jar target/$JAR_FILE_NAME"]
