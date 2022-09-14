package com.example.ARCHI_CLOUDAPP;

import com.example.ARCHI_CLOUDAPP.Entity.Count;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class ArchiCloudAppApplication implements ApplicationRunner {

	@Autowired
	Repo repo;

	public static void main(String[] args) {

		SpringApplication.run(ArchiCloudAppApplication.class, args);

	}


	@Override
	public void run(ApplicationArguments args) throws Exception {
		  getConnection();
          repo.deleteAll();
		  repo.save(new Count(1L , "Fahde" , "Bouzoubaa" , 0));


	}

	private  Connection getConnection() throws URISyntaxException, SQLException {
		URI dbUri = new URI(System.getenv("DATABASE_URL"));

		String username = dbUri.getUserInfo().split(":")[0];
		String password = dbUri.getUserInfo().split(":")[1];
		String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath() + "?sslmode=require";

		return DriverManager.getConnection(dbUrl, username, password);
	}
}
