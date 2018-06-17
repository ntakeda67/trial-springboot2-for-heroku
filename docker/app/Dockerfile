FROM openjdk:10-jdk
VOLUME /tmp
ADD ./verf.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar