FROM openjdk:11
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} git-action-CICD.jar
ENTRYPOINT ["java","-jar","/git-action-CICD.jar"]

