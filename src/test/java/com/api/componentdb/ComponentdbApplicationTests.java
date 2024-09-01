package com.api.componentdb;

import com.api.componentdb.component.Component;
import com.api.componentdb.entity.ComponentDTO;
import com.api.componentdb.repository.ComponentRepository;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ComponentdbApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private ComponentRepository componentRepository;

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}



}
