FROM openjdk:8-jre-slim
VOLUME /opt/didikle
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} didikle.jar
ENTRYPOINT ["java","-jar","/didikle.jar"]