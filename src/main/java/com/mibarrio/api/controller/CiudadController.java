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

    @GetMapping("/list")
    public ResponseEntity<List<Ciudad>>  getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/search/{identidficador}")
    public ResponseEntity<Ciudad> getById(@PathVariable("identidficador") Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }


}
