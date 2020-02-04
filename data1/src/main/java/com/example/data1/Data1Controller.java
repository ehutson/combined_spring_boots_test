package com.example.data1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Data1Controller {

    @RequestMapping("/data1")
    public String index() {
        return "Hello from data1";
    }
}
