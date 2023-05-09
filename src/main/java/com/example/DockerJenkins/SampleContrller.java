package com.example.DockerJenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleContrller {

    @GetMapping("/sample")
    public String sample()
    {
        System.out.println("Hi Akshay");
        return "Hi Akshay";
    }


}
