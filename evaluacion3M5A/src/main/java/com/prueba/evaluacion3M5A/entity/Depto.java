/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.evaluacion3M5A.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author LaptopSA
 */
@Document(collation = "depto")
@Data
public class Depto {

    @Id
    private Long deptoId;
    private String nombre;
    private String descripcion;
    private String director;

    
}
