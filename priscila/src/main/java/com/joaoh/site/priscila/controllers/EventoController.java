package com.joaoh.site.priscila.controllers;

import java.util.List;

import com.joaoh.site.priscila.domain.Evento;
import com.joaoh.site.priscila.services.EventoService;
import com.joaoh.site.priscila.services.utils.URICreator;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value = "/eventos")
public class EventoController {

    @Autowired
    private EventoService eventoService;
    
    @GetMapping
    public ResponseEntity<List<Evento>> findAll () {
        List<Evento> list = eventoService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Evento> findById(@PathVariable(name = "id") Integer eventoId) {
        Evento evento = eventoService.findById(eventoId);

        return ResponseEntity.ok().body(evento);
    }

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody Evento eventoObj) {
        eventoObj = eventoService.insert(eventoObj);
        return ResponseEntity.created(URICreator.buildLocation(eventoObj.getId())).build();
    }
    
}
