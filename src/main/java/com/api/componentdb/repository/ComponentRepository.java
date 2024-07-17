package com.api.componentdb.repository;

import com.api.componentdb.component.Component;
import org.springframework.data.repository.CrudRepository;

public interface ComponentRepository extends CrudRepository<Component,Integer> {


    public Component findByName(String name);

    public Component save(Component component);

}
