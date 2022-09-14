package com.example.ARCHI_CLOUDAPP;

import com.example.ARCHI_CLOUDAPP.Entity.Count;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArchiCloudAppApplication implements ApplicationRunner {

	@Autowired
	Repo repo;

	public static void main(String[] args) {

		SpringApplication.run(ArchiCloudAppApplication.class, args);

	}


	@Override
	public void run(ApplicationArguments args) throws Exception {
          repo.deleteAll();
		  repo.save(new Count(1L , "Fahde" , "Bouzoubaa" , 0));

	}
}
