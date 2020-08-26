FROM openjdk:11
ADD target/docker-0.0.1-SNAPSHOT.jar	docker-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "docker-0.0.1-SNAPSHOT.jar"]