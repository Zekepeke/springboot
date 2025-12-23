package com.zekepeke.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        // Instead of manually creating objects and injecting dependencies.
        // The ioc container takes care of that
        // ioc container
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);

        // raises error, 2 ways to solve this issue:
        // Using annotations (in the OrderService class in this case)
        // Using code
        var orderService = context.getBean(OrderService.class);
        orderService.placeOrder();
    }

}
