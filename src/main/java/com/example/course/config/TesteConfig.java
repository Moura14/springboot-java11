package com.example.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.course.entites.Order;
import com.example.course.entites.User;
import com.example.course.entites.enums.OrderStatus;
import com.example.course.repositories.OrderRepository;
import com.example.course.repositories.UserRepositry;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepositry userReopository;

	
	@Autowired
	private OrderRepository orderRepository;
		
	@Override
	public void run(String... args) throws Exception {
	
		
		
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "6140028922", "12345");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "9777777", "12345");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.WAITING_PAYMANT, u2);
		Order o3 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.WAITING_PAYMANT, u1);
		
	
		userReopository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
	

}
