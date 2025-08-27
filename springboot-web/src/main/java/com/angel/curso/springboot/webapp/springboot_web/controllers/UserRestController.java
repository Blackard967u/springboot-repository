package com.angel.curso.springboot.webapp.springboot_web.controllers;

import java.util.Map;
import java.util.HashMap;

//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.angel.curso.springboot.webapp.springboot_web.models.User;
import com.angel.curso.springboot.webapp.springboot_web.models.dto.UserDto;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details-user")
    public UserDto details() {
        UserDto userDto = new UserDto();
        User user = new User("Angel", "Ocaña");
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo");

        return userDto;
    }

    /*
     * @GetMapping("/details-user")
     * public Map<String, Object> details() {
     * User user = new User("Angel", "Ocaña");
     * Map<String, Object> body = new HashMap<>();
     * body.put("title", "Hola mundo Springboot");
     * body.put("user", user);
     * return body;
     * }
     */
}
