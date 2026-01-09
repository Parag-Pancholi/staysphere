package com.staysphere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class StaySphereApplication {

	public static void main(String[] args) {

        SpringApplication.run(StaySphereApplication.class, args);
        System.out.println("StaySphere Application Started Successfully!");
    }


}
