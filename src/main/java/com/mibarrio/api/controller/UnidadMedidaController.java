package com.mibarrio.api.controller;

import com.mibarrio.api.entity.UnidadMedida;
import com.mibarrio.api.service.impl.UnidadMedidaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("unidad_medida")
public class UnidadMedidaController {
    @Autowired
    private UnidadMedidaServiceImpl service;



    @GetMapping("/list")
    public ResponseEntity<List<UnidadMedida>>  getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/search/{identidficador}")
    public ResponseEntity<UnidadMedida> getById(@PathVariable("identidficador") Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }



}
