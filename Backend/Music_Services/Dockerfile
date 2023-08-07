FROM openjdk:17
ADD target/Music_Services-0.0.1-SNAPSHOT.war backend_music_service.war
EXPOSE 8087
ENTRYPOINT ["java", "-jar", "backend_music_service.war"]
