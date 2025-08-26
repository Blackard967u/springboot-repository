package com.angel.curso.springboot.webapp.springboot_web.controllers;

//import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {

    @GetMapping("/details")    
    public String details(Model model){
        model.addAttribute("title", "Hola mundo Springboot");
        model.addAttribute("name", "Angel");
        model.addAttribute("lastname", "Ocaña");
        return "details";
    }
/* 
    @GetMapping("/detailsMap")    
    public String details(Map<String, Object> model){
        model.put("title", "Hola mundo Springboot");
        model.put("name", "Angel");
        model.put("lastname", "Ocaña");
        return "details";
    }
*/
}
