package com.echomeet;

import com.echomeet.user.User;
import com.echomeet.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EchoMeetApplication {

	public static void main(String[] args) {
		SpringApplication.run(EchoMeetApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(UserService userService) {
		return args -> {
			userService.register(User.builder()
					.username("ocean")
					.email("ajay@gmail.com")
					.password("123")
					.build());
			userService.register(User.builder()
					.username("hustler")
					.email("cena@gmail.com")
					.password("ucantseeme")
					.build());
			userService.register(User.builder()
					.username("stomp")
					.email("viper@gmail.com")
					.password("rko")
					.build());
			System.out.println("Users in list: " + userService.findAll());
		};
	}
}