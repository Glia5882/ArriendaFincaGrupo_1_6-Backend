package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/grupo16/proyecto")
public class paginaPrincipalController {

    @GetMapping("/paginaPrincipal")
    public String paginaPrincipal() {
        return ("paginaPrincipal.html");
    }

}
