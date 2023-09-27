package com.example.Test_Cron.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public int exec(int a){
        return a*a;
    }

    public static void main(){
        System.out.println("This is a commit of main branch");
        System.out.println("This is an another line added in main branch");
    }
}
