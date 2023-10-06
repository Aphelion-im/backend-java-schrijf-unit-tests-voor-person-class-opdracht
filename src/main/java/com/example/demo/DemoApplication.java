// Solve YAML error in pom.xml: https://x.com/pvanhouwelingen/status/1709868096285016110?s=12
// https://www.geeksforgeeks.org/stringbuilder-tostring-method-in-java-with-examples/
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		System.out.println(StringMagic.reverseString("André"));
		System.out.println(StringMagic.reverseString("Hydroxychloroquine"));

	}

}
