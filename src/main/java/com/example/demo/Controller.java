package com.example.demo;

import com.example.demo.entity.Fact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class Controller
{
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/data")
    public Fact getData(){
        return restTemplate.getForObject("https://catfact.ninja/fact",Fact.class);
    }
}
