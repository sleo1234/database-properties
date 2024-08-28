package com.api.componentdb.restcontroller;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Set;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class ValidateInput {

    private HashMap<String, Double> userInput;
    private Set<String> dbList;


}
