package com.eureka.superheroestopsecret.service;

import com.eureka.superheroestopsecret.model.Organizacion;
import com.eureka.superheroestopsecret.repository.OrganizacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrganizationService {
    @Autowired
    private OrganizacionRepository organizacionRepository;
    public Organizacion createSuperheroe(Organizacion organizacion){
        return organizacionRepository.save(organizacion);
    }
    public Organizacion getOrganizacionById(Long id){
        Optional<Organizacion> organizacionOptional = organizacionRepository.findById(id);
        return organizacionOptional.get();
    }
    public List<Organizacion> getAllOrganitazions(){
        return organizacionRepository.findAll();
    }

    public void deleteOrganizacion(Long id){
        organizacionRepository.deleteById(id);
    }
}
