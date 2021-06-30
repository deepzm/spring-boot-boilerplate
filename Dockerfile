FROM openjdk:15-alpine

LABEL Name="Example API"

MAINTAINER cyberia

WORKDIR /usr/share/example-api
ADD api/build/libs/api.jar libs/example-api.jar


ENTRYPOINT exec java $JAVA_OPTS -jar /usr/share/example-api/libs/example-api.jar