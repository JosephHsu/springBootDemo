package com.example.demo;

import java.util.*;
import static java.lang.System.out;
public class CustomerDemo {
	public static void main(String[] args) {
		List<Customer> customers = Arrays.asList(
				new Customer("Joseph","Hsu"),
				new Customer("Winnie","Hsu"),
				new Customer("ASleep","ZZZ"));
		//Comparator<Customer> byLastName = Comparator.comparing((Customer cus)->cus.getLastName());
//		Comparator<Customer> byLastName = Comparator.comparing(Customer::getLastName);
//		customers.sort(byLastName);
//		customers.forEach(out::println);
		
		customers.stream().sorted(Comparator.comparing(Customer::getLastName)).forEach(System.out::println);
	}
	
}

class Customer {
	private String firstName;
	private String lastName;
	public Customer(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String toString() {
		return String.format("Customer:%s %s", firstName,lastName);
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
