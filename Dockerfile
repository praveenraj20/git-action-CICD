FROM openjdk:11
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} gitActionCICD-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/gitActionCICD-0.0.1-SNAPSHOT.jar "]

#EXPOSE 8080
#COPY ./build/libs/gitActionCICD-0.0.1-SNAPSHOT.jar /usr/app/
#WORKDIR /usr/app
#ENTRYPOINT ["java", "-jar", "gitActionCICD-0.0.1-SNAPSHOT.jar"]