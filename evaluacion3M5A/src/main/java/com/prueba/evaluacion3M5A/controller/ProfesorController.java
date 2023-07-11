/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.evaluacion3M5A.controller;

import com.prueba.evaluacion3M5A.entity.Profesor;
import com.prueba.evaluacion3M5A.service.ProfesorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LaptopSA
 */
@RestController
@RequestMapping("/api/profesor")
public class ProfesorController {

    @Autowired
    ProfesorService service;

    @GetMapping("/listar")
    public ResponseEntity<List<Profesor>> listaDepartamentos() {
        return new ResponseEntity<>(service.findByAll(),
                HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Profesor> crearDepartamento(
            @RequestBody Profesor p) {
        return new ResponseEntity<>(service.save(p),
                HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Profesor> actualizarDepartamento(@PathVariable Long id, @RequestBody Profesor p) {
        Profesor profesorEncontrado = service.findById(id);
        if (profesorEncontrado == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                profesorEncontrado.setDireccion(p.getDireccion());
                profesorEncontrado.setNombre(p.getNombre());
                profesorEncontrado.setTelefono(p.getTelefono());

                return new ResponseEntity<>(service.save(profesorEncontrado), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Profesor> eliminarDepartamento(@PathVariable Long id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
