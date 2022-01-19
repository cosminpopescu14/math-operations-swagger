FROM openjdk:17-alpine3.14
EXPOSE 8080
ARG JAR_FILE=target/math-operations-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} math-operations-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/math-operations-0.0.1-SNAPSHOT.jar"]