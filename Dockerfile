FROM openjdk:11
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} gitAction.jar
ENTRYPOINT ["java","-jar","/gitAction.jar"]