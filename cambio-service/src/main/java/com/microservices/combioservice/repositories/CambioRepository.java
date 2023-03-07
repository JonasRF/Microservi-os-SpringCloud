package com.microservices.combioservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.combioservice.model.Cambio;


public interface CambioRepository  extends JpaRepository<Cambio, Long>{

    Cambio findByFromAndTo(String from, String to);
}
