package com.angel.curso.springboot.webapp.springboot_web.controllers;

//import java.util.Map;
import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;

//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.angel.curso.springboot.webapp.springboot_web.models.User;
import com.angel.curso.springboot.webapp.springboot_web.models.dto.UserDto;

import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/list")
    public List<User> list() {
        User user = new User("Angel", "Ocaña");
        User user2 = new User("Nubia", "Juarez");
        User user3 = new User("Oscar", "Bruno");

        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        users.add(user3);

        return users;
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
