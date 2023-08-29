package com.mibarrio.api.controller;



import com.mibarrio.api.DTO.ProductoDTO;
import com.mibarrio.api.entity.Producto;
import com.mibarrio.api.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("producto")
public class ProductoController {
    @Autowired
    private ProductoService service;

    @PostMapping("/save")
    public ResponseEntity<ProductoDTO> register(@RequestBody ProductoDTO dto) {
        return new ResponseEntity<>(service.registerDto(dto), HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Producto>>  getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/search/{identificador}")
    public ResponseEntity<Producto> getById(@PathVariable("identificador") Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<Producto> update(@RequestBody Producto tienda) {
        return new ResponseEntity<Producto>(service.update(tienda), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
