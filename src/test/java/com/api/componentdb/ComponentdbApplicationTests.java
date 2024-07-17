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


	@Test
	void testAddComponent() {
		ComponentDTO componentDto = new ComponentDTO();
		componentDto.setName("COMPONENTTEST1");
		componentDto.setMOLE_WT(16.04);
		componentDto.setTc(190.6);
		componentDto.setPc(45.99);
		componentDto.setOmega(0.0115);
		ModelMapper mapper = new ModelMapper();
		Component component = mapper.map(componentDto, Component.class);
		componentRepository.save(component);
		assertNotNull(componentRepository.findByName("COMPONENTTEST1"));
	}

}
