package com.example.Test_Cron.conroller;

import com.example.Test_Cron.service.ExampleService;
import com.example.Test_Cron.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService _testservice;

    @Autowired
    private ExampleService _exampleserice;

    @GetMapping("/")
    public String test(){
        System.out.println("Controller is hit");
        return "Controller is hit";
    }

    @GetMapping("/exec")
    public int test1(@RequestParam(value="val", required = false) String a){
        System.out.println("exec is hit");
        return _testservice.exec(Integer.parseInt(a));
    }

    @GetMapping("/testexec")
    public int test2(@RequestParam(value="val", required = false) String a){
        System.out.println("test exec is hit");
        return _exampleserice.exec(Integer.parseInt(a));
    }


}
