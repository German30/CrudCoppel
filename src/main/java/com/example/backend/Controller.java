package com.example.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.PutMapping;



@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/personas"})
public class Controller {

    @Autowired
    PersonaService service;

    @GetMapping
    public List<inve>listar(){
        return service.listar();
    }

    @PostMapping
    public inve agregar(@RequestBody inve p){
        return service.add(p);
    }

    @GetMapping(value="/{id}")
    public inve listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }  
    
    @PutMapping(value="/{id}")
    public inve editar(@RequestBody inve p, @PathVariable("id") int id){
        p.setId(id);
        return service.edit(p);
    }

    @DeleteMapping(value = "/{id}")
    public inve delelte(@PathVariable("id")int id){
        return service.delete(id);
    }
}
