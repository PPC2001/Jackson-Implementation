package com.pratik.service;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJson {
		public static void main(String[] args) {
			
			Student student = new Student();
			student.setSid(100);
			student.setName("Pratik");
			student.setMarks(400);
			
			Address address = new Address();
			address.setArea("Mumbai");
			address.setFlatno(72);
			address.setBuildingName("Lodha Towers");
			
			student.setAddress(address);
			
			
			ObjectMapper mapper = new ObjectMapper();
			try {
				mapper.writeValue(new File("student.json"), student);
				System.out.println("JSON generated");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
