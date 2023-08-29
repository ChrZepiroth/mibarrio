package com.mibarrio.api.controller;


import com.mibarrio.api.DTO.TiendaDTO;
import com.mibarrio.api.entity.Tienda;
import com.mibarrio.api.service.impl.TiendaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("tienda")
public class TiendaController {
    @Autowired
    private TiendaServiceImpl service;

    @PostMapping("/save")
    public ResponseEntity<TiendaDTO> register(@RequestBody TiendaDTO dto) {
        return new ResponseEntity<>(service.registerDto(dto), HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Tienda>>  getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/search/{identificador}")
    public ResponseEntity<Tienda> getById(@PathVariable("identificador") Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<Tienda> update(@RequestBody Tienda tienda) {
        return new ResponseEntity<Tienda>(service.update(tienda), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
