package com.joaoh.site.priscila.services;

import java.util.List;

import com.joaoh.site.priscila.domain.Evento;
import com.joaoh.site.priscila.repositories.EventoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoService {
    @Autowired
    private EventoRepository eventoRepository;

    public List<Evento> findAll() {
        return eventoRepository.findAll();
    }

    public Evento insert(Evento evento) {
        evento.setId(null);
        return eventoRepository.save(evento);
    }
}
