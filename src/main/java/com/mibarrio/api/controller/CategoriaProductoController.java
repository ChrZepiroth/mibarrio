package com.mibarrio.api.controller;

import com.mibarrio.api.entity.CategoriaProducto;
import com.mibarrio.api.service.impl.CategoriaProductoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categoria_producto")
public class CategoriaProductoController {
    @Autowired
    private CategoriaProductoServiceImpl service;

    @PostMapping("/save")
    public ResponseEntity<CategoriaProducto> register(@RequestBody CategoriaProducto c) {
        return new ResponseEntity<>(service.register(c), HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<CategoriaProducto>>  getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/search/{identidficador}")
    public ResponseEntity<CategoriaProducto> getById(@PathVariable("identidficador") Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<CategoriaProducto> update(@RequestBody CategoriaProducto c) {
        return new ResponseEntity<CategoriaProducto>(service.register(c), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
