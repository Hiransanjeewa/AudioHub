FROM openjdk:17
ADD target/Play_List_Service-0.0.1-SNAPSHOT.war backend_playlist_service.war
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "backend_playlist_service.war"]
