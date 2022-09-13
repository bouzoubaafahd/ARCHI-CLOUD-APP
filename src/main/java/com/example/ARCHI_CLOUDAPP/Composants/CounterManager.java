package com.example.ARCHI_CLOUDAPP.Composants;

import com.example.ARCHI_CLOUDAPP.Entity.Count;
import com.example.ARCHI_CLOUDAPP.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CounterManager {

    @Autowired
    Repo repository;

    public void increment(Long id){
    Count count = repository.findCountById(id);
    repository.delete(count);
    count.setCounter(count.getCounter() + 1);
    repository.save(count);
    }

}
