package com.example.prueba_Ensolvers.service.serviceIpml;

import com.example.prueba_Ensolvers.entity.NotaEntity;
import com.example.prueba_Ensolvers.repository.NotaRepository;
import com.example.prueba_Ensolvers.service.NotaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotaServiceImpl implements NotaService {

    private final NotaRepository notaRepository;

    public NotaServiceImpl(NotaRepository notaRepository) {
        this.notaRepository = notaRepository;
    }

    @Override
    public List<NotaEntity> findAllNotas() {
        return notaRepository.findAll();
    }

    @Override
    public Optional<NotaEntity> findById(Long id) {
        return notaRepository.findById(id);
    }

    @Override
    public NotaEntity saveNota(NotaEntity notaEntity) {
        return notaRepository.save(notaEntity);
    }

    @Override
    public NotaEntity updateNota(NotaEntity notaEntity) {
        return notaRepository.save(notaEntity);
    }

    @Override
    public void deleteNota(Long id) {
        notaRepository.deleteById(id);
    }

}
