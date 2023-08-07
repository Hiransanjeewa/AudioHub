package com.AudioHub.Music_Services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MusicServiceAppication {
	public static void main(String[] args) {
		System.out.println("Music service is running");
		SpringApplication.run(MusicServiceAppication.class, args);
	}

}
