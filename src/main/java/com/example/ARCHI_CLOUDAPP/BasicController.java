package com.example.ARCHI_CLOUDAPP;

import com.example.ARCHI_CLOUDAPP.Composants.CounterManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @Autowired
    Repo repo;

    @Autowired
    CounterManager counterManager;



    @GetMapping( "")
    public @ResponseBody String greeting() {
        counterManager.increment(1L);

        return "<h1> Hello world!!</h1>" + repo.findById(1L).toString();
    }

}
