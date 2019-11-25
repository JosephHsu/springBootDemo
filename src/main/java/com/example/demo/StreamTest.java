package com.example.demo;


import java.util.Arrays;
import java.util.List;

public class StreamTest {
	public static void main(String[] args) {
		
		List<Staff> staffArray = Arrays.asList(
				new Staff("A","SD"),
				new Staff("B","IT Architect"),
				new Staff("C","IT Architect"));
		
		staffArray.stream().filter(
			    staff -> staff.getJobRole().equals("IT Architect")
			    )
			    .findFirst().orElse(null);
	}
}
class Staff{
	private String name;
	private String jobRole;
	Staff(String name,String jobRole){
		this.name = name;
		this.jobRole = jobRole;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobRole() {
		return jobRole;
	}
	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}
	
}
