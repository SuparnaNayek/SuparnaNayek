package com.example7.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

public class SpringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext context = SpringApplication.run(SpringDemo.class, args);
//		Home h = new Home(); //tight coupling 
		Home h = context.getBean(Home.class);
		h.connect();

		Home h2 = context.getBean(Home.class);
		h2.connect();

		Home h3 = context.getBean(Home.class);
		h3.connect();
	}

}
