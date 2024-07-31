package com.api.componentdb.restcontroller;


import com.api.componentdb.component.Component;
import com.api.componentdb.entity.ComponentDTO;
import com.api.componentdb.entity.ComponentResponseBody;
import com.api.componentdb.repository.ComponentRepository;
import com.api.componentdb.service.ComponentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.table.TableCellEditor;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ComponentRestController {

   @Autowired private ComponentRepository repo;
    @Autowired private ComponentService componentService;


    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }



    @GetMapping("/message")
    public String getmessage (){
        return "OK";
    }
    @GetMapping("/getProperties")
    public ResponseEntity<ComponentResponseBody> getPropertiesByName (@RequestParam("names") List<String> names){


        List<Component> components = componentService.getListOfComponents(names);

        List<Double> Tc = componentService.getTc(names,components);
        List<Double> Pc = componentService.getPc(names,components);
        List<Double> omega = componentService.getOmega(names,components);


           ComponentResponseBody responseBody = new ComponentResponseBody(Tc,Pc,omega);




         return new ResponseEntity <>(responseBody, HttpStatus.OK);
    }



    @GetMapping("/all_components")
    public List<String> returnAllComponents (){

        List<Component> components = (List<Component>) repo.findAll();

        List<String> names = new ArrayList<>();
        for (Component component : components){
            names.add(component.getName());
        }
        return names;
    }

    @PostMapping("/add_component")
    public ResponseEntity<Component> addComponent (@RequestBody Component component){


        Component newComponent = repo.save(component);
        return new ResponseEntity<>(newComponent,HttpStatus.CREATED);
    }



    public Component convertToEntity(ComponentDTO componentDto) {
        ModelMapper modelMapper = new ModelMapper();
        Component component = modelMapper.map(componentDto, Component.class);
        return component;
    }


}
