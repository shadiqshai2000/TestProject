package com.example.Test_Cron.service;

import org.springframework.stereotype.Component;

@Component
public class ExampleService {
    public int exec(int a){
        return a*a*a;
    }
}
