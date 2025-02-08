FROM openjdk:17
COPY ./target/hello-world-deepan-docker.jar hello-world-deepan-docker.jar
CMD ["java", "-jar", "hello-world-deepan-docker.jar"]