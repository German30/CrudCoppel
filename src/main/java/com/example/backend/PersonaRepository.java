package com.example.backend;

import java.util.List;
import org.springframework.data.repository.Repository;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

public interface PersonaRepository extends  Repository<inve, Integer>{

    List<inve>findAll();
    inve findById(int id);
    inve save(inve p);
    void delete(inve p);
    //boolean existById(Id primaryKey);

}