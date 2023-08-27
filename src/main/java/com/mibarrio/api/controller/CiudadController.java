package com.mibarrio.api.controller;

import com.mibarrio.api.entity.Ciudad;
import com.mibarrio.api.service.impl.CiudadServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ciudad")
public class CiudadController {
    @Autowired
    private CiudadServiceImpl service;

    @PostMapping("/save")
    public ResponseEntity<Ciudad> register(@RequestBody Ciudad c) {
        return new ResponseEntity<>(service.register(c), HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Ciudad>>  getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/search/{identidficador}")
    public ResponseEntity<Ciudad> getById(@PathVariable("identidficador") Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<Ciudad> update(@RequestBody Ciudad c) {
        return new ResponseEntity<Ciudad>(service.register(c), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
