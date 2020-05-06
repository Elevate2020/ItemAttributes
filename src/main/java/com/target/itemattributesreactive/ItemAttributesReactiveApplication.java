package com.target.itemattributesreactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.target")
public class ItemAttributesReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemAttributesReactiveApplication.class, args);
	}

}
