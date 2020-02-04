package com.example.data2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Data2Controller {

    @RequestMapping("/data2")
    public String index() {
        return "Hello from data2";
    }
}
