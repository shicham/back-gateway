FROM openjdk:latest
ARG JAR_FILE=target/back-gateway-0.0.1.jar
COPY ${JAR_FILE} data/back-gateway-0.0.1.jar
EXPOSE 8000
ENTRYPOINT ["java","-jar","data/back-gateway-0.0.1.jar"]
