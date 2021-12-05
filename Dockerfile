FROM java:8-jdk-alpine

COPY ./target/spring-boot-docker-app.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch spring-boot-docker-app.jar'

ENTRYPOINT ["java","-jar","spring-boot-docker-app.jar"]