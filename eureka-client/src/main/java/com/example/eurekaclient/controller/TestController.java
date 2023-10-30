package com.example.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <h3>conteiner</h3>
 * <p>Description: </p>
 *
 * @Author: Krustalev_Ivan
 * @date : 2023-10-30 22:04
 */
@RestController
@RequestMapping("/main")
public class TestController {
    @Value("${eureka.instance.instance-id}")
    private String id ;

    @GetMapping("/test")
    public String test() {
        return id;
    }
}
