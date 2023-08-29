package com.mibarrio.api.controller;

import com.mibarrio.api.DTO.DBAUsersDTO;
import com.mibarrio.api.entity.Ciudad;
import com.mibarrio.api.entity.DBAUsers;
import com.mibarrio.api.entity.Persona;
import com.mibarrio.api.service.impl.CiudadServiceImpl;
import com.mibarrio.api.service.impl.DBAUsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("dbausers")
public class DBAUsersController {
    @Autowired
    private DBAUsersServiceImpl service;

    @PostMapping("/save")
    public ResponseEntity<DBAUsers> register(@RequestBody DBAUsers c) {
        return new ResponseEntity<>(service.register(c), HttpStatus.CREATED);
    }

    @PostMapping("/saveDTO")
    public ResponseEntity<DBAUsersDTO> registerDTO(@RequestBody DBAUsersDTO c) {
        return new ResponseEntity<>(service.registerDto(c), HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<DBAUsers>>  getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/login")
    public ResponseEntity<List<DBAUsers>> logeo(@RequestParam String user, @RequestParam String pass){
        List<DBAUsers> dbaUsers = service.findByUserAndPass(user, pass);
        return ResponseEntity.ok(dbaUsers);
    }

    @GetMapping("/loginDTO")
    public ResponseEntity<List<DBAUsersDTO>> logeoDTO(@RequestParam String user, @RequestParam String pass){
        List<DBAUsersDTO> dbaUsersDTO = service.findByUserAndPassDTO(user, pass);
        return ResponseEntity.ok(dbaUsersDTO);
    }

    @GetMapping("/search/{identificador}")
    public ResponseEntity<DBAUsers> getById(@PathVariable("identificador") Integer id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<DBAUsers> update(@RequestBody DBAUsers c) {
        return new ResponseEntity<DBAUsers>(service.register(c), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
