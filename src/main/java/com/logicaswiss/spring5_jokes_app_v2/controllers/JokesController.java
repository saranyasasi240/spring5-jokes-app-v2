package com.logicaswiss.spring5_jokes_app_v2.controllers;

import com.logicaswiss.spring5_jokes_app_v2.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping("/")
    public String getJokes(Model model) {
        String joke = jokesService.getJoke();
        model.addAttribute("joke", joke);
        return "index";
    }
}
