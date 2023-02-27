FROM openjdk:11
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} git-action-cicd.jar
ENTRYPOINT ["java","-jar","/git-action-cicd.jar"]