package com.eureka.superheroestopsecret;

import com.eureka.superheroestopsecret.model.Organizacion;
import com.eureka.superheroestopsecret.model.Superheroe;
import com.eureka.superheroestopsecret.repository.OrganizacionRepository;
import com.eureka.superheroestopsecret.repository.SuperheroeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Component
public class ApplicationRunner implements CommandLineRunner {
    @Autowired
    private OrganizacionRepository organizacionRepository;

    @Autowired
    private SuperheroeRepository superheroeRepository;

    @Override
    public void run(String... args) throws Exception {
        Organizacion xmen = new Organizacion();
        xmen.setNombre("x-men");
        xmen.setPublico(true);

        Organizacion avengers = new Organizacion();
        avengers.setNombre("The Avengers");
        avengers.setPublico(true);

        Superheroe spiderman = new Superheroe();
        spiderman.setAlias("Spiderman");
        spiderman.setVigencia(true);
        spiderman.setOrganizacion(avengers);
        spiderman.setEstatura(1.78);

        Superheroe wolverine = new Superheroe();
        wolverine.setAlias("Wolverine");
        wolverine.setEstatura(1.60);
        wolverine.setVigencia(true);
        wolverine.setOrganizacion(xmen);

        Superheroe jean = new Superheroe();
        jean.setAlias("Jean-Gray");
        jean.setEstatura(1.68);
        jean.setVigencia(false);
        jean.setOrganizacion(xmen);

        organizacionRepository.save(xmen);
        organizacionRepository.save(avengers);
        superheroeRepository.save(spiderman);
        superheroeRepository.save(wolverine);
        superheroeRepository.save(jean);



    }
}
