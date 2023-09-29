package com.eureka.superheroestopsecret.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name= "superheroes")
@Getter
@Setter
@NoArgsConstructor
public class Superheroe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String alias;
    private float estatura;
    private LocalDateTime nacimiento;
    @ManyToOne
    private Organizacion organizacion;

}
