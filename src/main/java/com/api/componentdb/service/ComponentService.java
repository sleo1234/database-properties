package com.api.componentdb.service;


import com.api.componentdb.component.Component;
import com.api.componentdb.repository.ComponentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComponentService {

    @Autowired private ComponentRepository repo;

    public List<Component> getListOfComponents (List<String> names){
        List<Component> components = new ArrayList<>();


        for (int i=0; i < names.size(); i++){
            components.add(repo.findByName(names.get(i)));
        }

        return components;
    }


    public List<Double> getTc(List<String> names, List<Component> components){
        List<Double> Tc = new ArrayList<>();


        for (int i=0; i < names.size(); i++){
            Tc.add(components.get(i).getTc());
        }
    return Tc;
    }


    public List<Double> getPc(List<String> names, List<Component> components){
        List<Double> Pc = new ArrayList<>();


        for (int i=0; i < names.size(); i++){
            Pc.add(components.get(i).getPc());
        }
        return Pc;
    }


    public List<Double> getOmega(List<String> names,List<Component> components){
        List<Double> omega = new ArrayList<>();


        for (int i=0; i < names.size(); i++){
            omega.add(components.get(i).getOmega());
        }
        return omega;
    }


}
