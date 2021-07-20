package com.joaoh.site.priscila.services;

import java.util.List;

import com.joaoh.site.priscila.domain.Evento;
import com.joaoh.site.priscila.domain.dto.EventoDTO;
import com.joaoh.site.priscila.repositories.EventoRepository;
import com.joaoh.site.priscila.services.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoService {
    @Autowired
    private EventoRepository eventoRepository;

    public List<Evento> findAll() {
        return eventoRepository.findAll();
    }

    public Evento findById(Integer eventoId) {
        return eventoRepository.findById(eventoId).orElseThrow(() -> new ObjectNotFoundException("Cidade id " + eventoId + " não encontrado"));
    }

    public Evento insert(Evento evento) {
        evento.setId(null);
        return eventoRepository.save(evento);
    }

    public Evento update(Integer id, EventoDTO eventoDto) {
        Evento evento = this.findById(id);
        this.updateDatabase(evento, eventoDto);

        return eventoRepository.save(evento);
    }

    public void updateDatabase(Evento evento, EventoDTO eventoDto) {
        if (eventoDto.getData() == null || eventoDto.getDescricao() == null || eventoDto.getNome() == null) {
            evento.setData(evento.getData());
            evento.setDescricao(evento.getDescricao());
            evento.setNome(evento.getNome());
        } else {
            evento.setData(eventoDto.getData());
            evento.setDescricao(eventoDto.getDescricao());
            evento.setNome(eventoDto.getNome());
        }
    }

    


}
