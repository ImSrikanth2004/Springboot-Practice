package com.spring1.learn_spring_framework.helloWorld;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

record Address(String Lane, String city) {}
record Person(String name, int age, Address address) {}
@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "Srikanth";
	}
	@Bean
	public int age() {
		return 21;
	}
	@Bean
	public Person person() {
		var person = new Person("Prasad", 52, new Address("133-7-1560", "Guntur"));
		return person;
	}
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
		}
	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		return new Person(name, age, address3);
		}
	@Bean
	public Person person4Parameters(String name, int age, Address address) {
		return new Person(name, age, address);
	}
	@Bean
	public Person person5Qualifier(String name, int age, @Qualifier("address3Qualifier") Address address) {
		return new Person(name, age, address);
	}
	@Bean(name="address2")
	@Primary
	public Address address() {
		var address = new Address("4th Lane Panduranga Nagar", "Guntur");
		return address;
	}
	@Bean(name="address3")
	@Qualifier("address3Qualifier")
	public Address address3() {
		var address = new Address("Amaravati", "Guntur");
		return address;
	}
}
