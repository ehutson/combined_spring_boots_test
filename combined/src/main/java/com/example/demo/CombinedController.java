package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CombinedController {

    @RequestMapping("/")
    public String index() {
        return "Hello from combined";
    }
}
