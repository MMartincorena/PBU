package com.example.prueba_Ensolvers.controller;

import org.springframework.web.bind.annotation.*;
import com.example.prueba_Ensolvers.entity.NotaEntity;
import com.example.prueba_Ensolvers.service.NotaService;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/nota")
public class NotaController {

    private final NotaService notaService;

    public NotaController(NotaService notaService) {
        this.notaService = notaService;
    }

    @GetMapping
    public List<NotaEntity> findAllNotas() {
        return notaService.findAllNotas();
    }

    @GetMapping("/{id}")
    public Optional<NotaEntity> findByIdNota(@PathVariable("id") Long id){
        return notaService.findById(id);
    }

    @PostMapping
    public NotaEntity saveNota(@RequestBody NotaEntity notaEntity){
        return notaService.saveNota(notaEntity);
    }

    @PutMapping
    public NotaEntity updateNota(@RequestBody NotaEntity notaEntity){
        return notaService.updateNota(notaEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteNota(@PathVariable("id") Long id){
        notaService.deleteNota(id);
    }

}
