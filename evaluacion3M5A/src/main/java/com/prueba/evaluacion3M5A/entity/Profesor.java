/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.evaluacion3M5A.entity;

import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author LaptopSA
 */
@Document(collation = "profesor")
@Data
public class Profesor {

    @Id
    private Long profId;
    private String nombre;
    private String Direccion;
    private String Telefono;

   private List<Depto> listaDepartamentos;
}
