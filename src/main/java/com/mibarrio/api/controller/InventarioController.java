package com.mibarrio.api.controller;

import com.mibarrio.api.DTO.InventarioDTO;
import com.mibarrio.api.entity.Inventario;
import com.mibarrio.api.service.impl.InventarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("inventario")
public class InventarioController {
    @Autowired
    private InventarioServiceImpl service;

    @PostMapping("/save")
    public ResponseEntity<InventarioDTO> register(@RequestBody InventarioDTO dto) {
        return new ResponseEntity<>(service.registerDto(dto), HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Inventario>>  getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/buscarPorTienda")
    public ResponseEntity<List<Inventario>> buscarPorTienda(@RequestParam Integer tienda){
        List<Inventario> inventariosPorTienda = service.getInventarioByTienda(tienda);
        return ResponseEntity.ok(inventariosPorTienda);
    }

    @GetMapping("/search/{identificador}")
    public ResponseEntity<Inventario> getById(@PathVariable("identificador") Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<Inventario> update(@RequestBody Inventario inventario) {
        return new ResponseEntity<Inventario>(service.update(inventario), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
