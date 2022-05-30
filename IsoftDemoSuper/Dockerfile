FROM openjdk:17

VOLUME /tmp

EXPOSE 8080

COPY target/IsoftDemoSuper-0.0.1-SNAPSHOT.jar IsoftDemoSuper.jar

ENTRYPOINT ["java", "-jar", "IsoftDemoSuper.jar"]

#sudo docker build -t demo-container .
#sudo docker run -p 8080:8080 -d demo-container