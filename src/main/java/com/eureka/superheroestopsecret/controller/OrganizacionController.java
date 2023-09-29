package com.eureka.superheroestopsecret.controller;

import com.eureka.superheroestopsecret.model.Organizacion;
import com.eureka.superheroestopsecret.service.OrganizacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/organizaciones")
public class OrganizacionController {
    @Autowired
    private OrganizacionService organizacionService;
    @PostMapping
    public Organizacion createOrganizacion(@RequestBody Organizacion organizacion){
        return organizacionService.createOrganizacion(organizacion);
    }
    @GetMapping
    public List<Organizacion> getAllOrganizations(){
        return organizacionService.getAllOrganitazions();
    }
    @GetMapping("{id}")
    public Organizacion getOrganizationById(@PathVariable("id") Long id){
        return organizacionService.getOrganizacionById(id);
    }
    @DeleteMapping("{id}")
    public void deleteOrganizationById(@PathVariable("id") Long id){
        organizacionService.deleteOrganizacion(id);
    }


}
