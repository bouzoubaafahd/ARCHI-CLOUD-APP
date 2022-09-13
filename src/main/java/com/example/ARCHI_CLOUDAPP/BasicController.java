package com.example.ARCHI_CLOUDAPP;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {



    @GetMapping( "")
    public @ResponseBody String greeting() {
        return "<h1> Yaa lghder bda </h1>";
    }

}
