package com.example.ARCHI_CLOUDAPP;

import com.example.ARCHI_CLOUDAPP.Entity.Count;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface  Repo  extends CrudRepository<Count , Long> {

    Count findCountById(Long id);
    Count findCountByName(String name);





}
