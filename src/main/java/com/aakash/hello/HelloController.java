package com.aakash.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String requestMethodName() {
        return "new SomeData()";
    }

}
