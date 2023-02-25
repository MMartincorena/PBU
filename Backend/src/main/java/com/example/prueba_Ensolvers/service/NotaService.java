package com.example.prueba_Ensolvers.service;

import com.example.prueba_Ensolvers.entity.NotaEntity;

import java.util.List;
import java.util.Optional;

public interface NotaService {

    List<NotaEntity> findAllNotas();
    Optional<NotaEntity> findById(Long id);
    NotaEntity saveNota(NotaEntity notaEntity);
    NotaEntity updateNota(NotaEntity notaEntity);
    void deleteNota(Long id);

}
