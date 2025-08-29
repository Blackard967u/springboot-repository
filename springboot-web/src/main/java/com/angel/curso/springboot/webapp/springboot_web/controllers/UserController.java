package com.angel.curso.springboot.webapp.springboot_web.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.angel.curso.springboot.webapp.springboot_web.models.User;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Angel", "Ocaña");
        user.setEmail("anjaocar@gmail.com");
        User user2 = new User("Nubia", "Juarez");
        User user3 = new User("Oscar", "Bruno");

        model.addAttribute("title", "Hola mundo Springboot");
        model.addAttribute("user", user);
        return "details";
    }
    /*
     * @GetMapping("/detailsMap")
     * public String details(Map<String, Object> model){
     * model.put("title", "Hola mundo Springboot");
     * model.put("name", "Angel");
     * model.put("lastname", "Ocaña");
     * return "details";
     * }
     */

    @GetMapping("/list")
    public String list(ModelMap model) {

        // model.addAttribute("users", users);
        model.addAttribute("title", "Listado de usuarios");

        return "list";
    }

    @ModelAttribute("users")
    public List<User> usersModel() {
        List<User> users = Arrays.asList(
            new User("Angel", "Ocaña", "anjaocar1425@gmail.com"),
            new User("Nubia", "Juarez"));
        return users;
    }

}
