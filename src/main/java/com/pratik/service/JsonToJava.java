package com.pratik.service;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJava {
	public static void main(String[] args) throws IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		Student student = mapper.readValue(new File("student.json"), Student.class);
		
		System.out.println(student.getSid());
		System.out.println(student.getName());
		System.out.println(student.getMarks());
		
		Address address = student.getAddress();
		
		System.out.println();
		
		System.out.println(address.getArea());
		System.out.println(address.getBuildingName());
		System.out.println(address.getFlatno());
	}
}
