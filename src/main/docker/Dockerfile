FROM openjdk:8-jdk-alpine
VOLUME /tmp
WORKDIR /
ADD demo-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar"]