package com.mibarrio.api.controller;

import com.mibarrio.api.entity.Rol;
import com.mibarrio.api.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rol")
public class RolController {
    @Autowired
    private RolService service;

    @PostMapping("/save")
    public ResponseEntity<Rol> register(@RequestBody Rol rol) {
        return new ResponseEntity<>(service.register(rol), HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Rol>>  getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/search/{identidficador}")
    public ResponseEntity<Rol> getById(@PathVariable("identidficador") Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<Rol> update(@RequestBody Rol rol) {
        return new ResponseEntity<Rol>(service.register(rol), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
