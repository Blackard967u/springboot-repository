package com.angel.curso.springboot.webapp.springboot_web.controllers;

import java.util.Map;
import java.util.HashMap;

//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserRestController {

    @GetMapping("/details-user")    
    public Map<String, Object> details(){
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola mundo Springboot");
        body.put("name", "Angel");
        body.put("lastname", "Ocaña");
        return body;
    }
}
