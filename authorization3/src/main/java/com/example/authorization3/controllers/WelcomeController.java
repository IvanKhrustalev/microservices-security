package com.example.authorization3.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * <h3>conteiner</h3>
 * <p>Description: </p>
 *
 * @Author: Krustalev_Ivan
 * @date : 2023-10-30 22:56
 */
@RestController
@RequestMapping
@RequiredArgsConstructor
public class WelcomeController {


    @PostMapping("/afterLogin")
    public String successLogin() {
        return "You are successfully login!";
    }
}
