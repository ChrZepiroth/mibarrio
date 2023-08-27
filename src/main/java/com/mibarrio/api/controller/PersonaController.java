package com.mibarrio.api.controller;

import com.mibarrio.api.DTO.PersonaDTO;
import com.mibarrio.api.entity.Persona;
import com.mibarrio.api.entity.Rol;
import com.mibarrio.api.service.impl.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("persona")
public class PersonaController {
    @Autowired
    private PersonaServiceImpl service;

    @PostMapping("/save")
    public ResponseEntity<Persona> register(@RequestBody Persona p) {
        return new ResponseEntity<>(service.register(p), HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Persona>>  getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/buscarPorRol")
    public ResponseEntity<List<Persona>> buscarPorRol(@RequestParam Integer roles) {
        List<Persona> personas = service.getUserByRol(roles);
        return ResponseEntity.ok(personas);
    }

    @GetMapping("/search/{identidficador}")
    public ResponseEntity<Persona> getById(@PathVariable("identidficador") String id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<Persona> update(@RequestBody Persona p) {
        return new ResponseEntity<Persona>(service.register(p), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") String id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
