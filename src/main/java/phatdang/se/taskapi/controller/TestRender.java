package phatdang.se.taskapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRender {
    @GetMapping("sayHello")
    public String sayHello(){
        return "1";
    }
}
