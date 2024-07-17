package com.api.componentdb.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ComponentDTO {

    private Integer id;
    private String name;

    private Double mole_WT;

    private Double tc;


    private Double pc;

    private Double omega;


}
