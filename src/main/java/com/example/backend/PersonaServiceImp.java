package com.example.backend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImp implements PersonaService{

    @Autowired
    private PersonaRepository repository;

    @Override
    public List<inve> listar() {
       return repository.findAll();
    }

    @Override
    public inve listarId(int id) {
        return repository.findById(id);
    }

    @Override
    public inve add(inve p) {
        return repository.save(p);
    }

    @Override
    public inve edit(inve p) {
        return repository.save(p);
    }

    @Override
    public inve delete(int id) {
        inve p = repository.findById(id);
        if(p != null){
            repository.delete(p);
        }
        return p;
    }
 
}
