/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prueba.evaluacion3M5A.repository;

import com.prueba.evaluacion3M5A.entity.Curso;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author LaptopSA
 */
public interface CursoRepository extends MongoRepository<Curso, Long>{
    
}
