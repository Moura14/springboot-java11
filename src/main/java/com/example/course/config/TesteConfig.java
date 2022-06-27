package com.example.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.course.entites.User;
import com.example.course.repositories.UserRepositry;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepositry userReopository;

	@Override
	public void run(String... args) throws Exception {
	
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "6140028922", "12345");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "9777777", "12345");
		
		userReopository.saveAll(Arrays.asList(u1, u2));
	}
	

}
