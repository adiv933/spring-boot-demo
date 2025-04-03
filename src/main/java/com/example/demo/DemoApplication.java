package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		// ! WITHOUT USING BEANS
		// var obj = new OrderDemo(new PaypalPaymentService());
		// obj.placeOrder(20);

		// obj = new OrderDemo(new StripePaymentService());
		// obj.placeOrder(25);

		// ! WITH BEANS
		OrderDemo orderDemoBean = context.getBean(OrderDemo.class);
		orderDemoBean.placeOrder(20);
	}

}
