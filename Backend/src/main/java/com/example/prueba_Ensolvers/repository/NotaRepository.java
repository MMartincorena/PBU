package com.example.prueba_Ensolvers.repository;

import com.example.prueba_Ensolvers.entity.NotaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaRepository extends JpaRepository<NotaEntity, Long> {

}
