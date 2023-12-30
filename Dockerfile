FROM openjdk:17
WORKDIR /App

COPY /target/app.jar .


ENTRYPOINT ["java", "-jar" , "app.jar"]