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


    @GetMapping("/list")
    public ResponseEntity<List<Rol>>  getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/search/{identidficador}")
    public ResponseEntity<Rol> getById(@PathVariable("identidficador") Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

}
