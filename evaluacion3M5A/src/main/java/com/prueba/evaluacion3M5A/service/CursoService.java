/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.evaluacion3M5A.service;

import com.prueba.evaluacion3M5A.entity.Curso;
import com.prueba.evaluacion3M5A.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author LaptopSA
 */
@Service
public class CursoService extends GenericServiceImpl<Curso, Long> implements GenericService<Curso, Long> {

    @Autowired
    CursoRepository repository;

    @Override
    public CrudRepository<Curso, Long> getDao() {
        return repository;
    }
}
