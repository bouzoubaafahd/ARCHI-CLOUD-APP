package com.example.ARCHI_CLOUDAPP;

import com.example.ARCHI_CLOUDAPP.Composants.CounterManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbController {

    @Autowired
    Repo repo;

    @Autowired
    CounterManager counterManager;



    @GetMapping( "/db")
    public @ResponseBody String greeting() {
          counterManager.increment("Fahde");

        return "<h1>" + repo.findCountByName("Fahde").toString() + "</h1>" ;

    }

}
