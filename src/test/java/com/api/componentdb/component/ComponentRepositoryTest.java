package com.api.componentdb.component;


import com.api.componentdb.repository.ComponentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.ArrayList;
import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = true)

public class ComponentRepositoryTest {


   @Autowired private ComponentRepository repo;


    @Test
    public void testFindByName (){

        String name = "2,2 DIMETHYL BUTANE";
        Component component = repo.findByName(name);
       System.out.println( component.toString());
    }

    @Test
    public void testFindAll(){

        List<Component> componentList = ( List<Component>) repo.findAll();

       // componentList.forEach(System.out :: println);

        List<Component> filteredComponents = new ArrayList<>();

                componentList.stream()
                .filter(c -> c.getTc() < 450.0)
                .forEach(System.out :: println);
    }



}
