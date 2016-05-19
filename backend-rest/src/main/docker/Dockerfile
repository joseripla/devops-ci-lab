FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER José Ricardo Pla <joseripla@gmail.com>
VOLUME /tmp
ADD lab-rest-service-v6.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-Dspring.profiles.active=container","-jar","/app.jar"]
