package com.api.componentdb.repository;

import com.api.componentdb.component.Component;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ComponentRepository extends CrudRepository<Component,Integer> {


    public Component findByName(String name);

    public Component save(Component component);
    public List<Component> saveAll(List<Component> components);

}
