/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.evaluacion3M5A.service;

import com.prueba.evaluacion3M5A.entity.Depto;
import com.prueba.evaluacion3M5A.repository.DeptoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author LaptopSA
 */
@Service
public class DeptoService extends GenericServiceImpl<Depto, Long> implements GenericService<Depto, Long> {

    @Autowired
    DeptoRepository repository;

    @Override
    public CrudRepository<Depto, Long> getDao() {
        return repository;
    }
}
