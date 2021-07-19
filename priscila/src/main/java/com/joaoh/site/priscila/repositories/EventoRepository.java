package com.joaoh.site.priscila.repositories;

import com.joaoh.site.priscila.domain.Evento;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Integer> {
    
}
