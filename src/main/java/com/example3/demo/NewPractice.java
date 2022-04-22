package com.example3.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


public class NewPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext context = SpringApplication.run(SpringDemoInitialApplication.class, args);
//		Home h = new Home(); //tight coupling 
		Home h = context.getBean(Home.class);
		h.connect();

		Home h2 = context.getBean(Home.class);
		h2.connect();

		Home h3 = context.getBean(Home.class);
		h3.connect();
	}

}
