package com.fab.reactive_web_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.fab.reactive_web_service.client.GreetingClient;

@SpringBootApplication
public class ReactiveWebServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ReactiveWebServiceApplication.class, args);
		GreetingClient greetingClient = context.getBean(GreetingClient.class);
		// We need to block for the content here or the JVM might exit before the
		// message is logged
		System.out.println(">> message = " + greetingClient.getMessage().block());
	}

}
