package com.example.eurekaclient2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <h3>conteiner</h3>
 * <p>Description: </p>
 *
 * @Author: Krustalev_Ivan
 * @date : 2023-10-30 22:29
 */
@RestController
@RequestMapping("/test2")
public class Test2Controller {

    @GetMapping
    public String test() {
        return "Hello World!";
    }
}
