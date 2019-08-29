FROM openjdk:8-jre-alpine
MAINTAINER Yogesh Mahajan <mahajany@gmail.com>

ENV APP_EXE account-vertx-service-1.0-SNAPSHOT.jar
ENV DATABASE_USER mongo
ENV DATABASE_PASSWORD mongo
ENV DATABASE_NAME db
EXPOSE 8095
COPY target/$APP_EXE app.jar
# WORKDIR $VERTICLE_HOME
EXPOSE 8080 8888
USER 1001
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar app.jar"]