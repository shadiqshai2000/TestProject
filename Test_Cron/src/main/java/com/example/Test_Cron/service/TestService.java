package com.example.Test_Cron.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public int exec(int a){
        return a*a;
    }
}
