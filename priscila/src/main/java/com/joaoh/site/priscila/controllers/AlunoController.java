package com.joaoh.site.priscila.controllers;

import java.util.List;

import com.joaoh.site.priscila.domain.Aluno;
import com.joaoh.site.priscila.domain.dto.AlunoDTO;
import com.joaoh.site.priscila.services.AlunoService;
import com.joaoh.site.priscila.services.utils.URICreator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {
    
    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public  ResponseEntity<List<Aluno>> findAll() {
        List<Aluno> list = alunoService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public  ResponseEntity<Aluno> findOne(@PathVariable(name = "id") Integer alunoId) {
        Aluno aluno = alunoService.findById(alunoId);
        return ResponseEntity.ok().body(aluno);
    }

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody Aluno aluno) {
        alunoService.insert(aluno);
        
        return ResponseEntity.created(URICreator.buildLocation(aluno.getId())).build();
    }
    
    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> update(@RequestBody AlunoDTO objDto, @PathVariable(name = "id") Integer alunoId) {
        alunoService.update(objDto, alunoId);
        
        return ResponseEntity.ok().build();
    }
    
    
}
