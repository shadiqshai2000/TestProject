package com.example.Test_Cron.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public int exec(int a){
        return a*a;
    }

    public static void main(){
        System.out.println("This is a commit of main branches");
        System.out.println("another new line");
    }
}
