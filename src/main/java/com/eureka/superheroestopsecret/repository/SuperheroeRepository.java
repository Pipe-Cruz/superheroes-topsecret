package com.eureka.superheroestopsecret.repository;

import com.eureka.superheroestopsecret.model.Superheroe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperheroeRepository extends JpaRepository<Superheroe, Long> {
}
