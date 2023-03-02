package com.microservices.combioservice.repositories;

import com.microservices.combioservice.model.Cambio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CambioRepository  extends JpaRepository<Cambio, Long>{

    Cambio findByFromAndTo(String from, String to);
}
