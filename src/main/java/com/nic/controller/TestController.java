package com.nic.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nic.dao.TestDao;
import com.nic.model.TestModel;

@RestController
@RequestMapping("/test")
public class TestController {

//	@Autowired
//	DataSource dataSource =MyDataSource.getDataSource();

	@Autowired
	TestDao service;

	ObjectMapper mapper = new ObjectMapper();

	@GetMapping("/gett")
	public String get() {
		// READING JSON STRING TO LIST
//		Student student = mapper.readValue(jsonString, Student.class);
		String res = null;
		try {
			List<TestModel> list = service.findAll();
			if (list != null) {
				res = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);
			}
		} catch (Exception e) {
			System.out.println("Exp in get() :" + e);
		}
		return res;
	}
}
