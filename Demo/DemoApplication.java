package com.example.demo;
import org.springframework.boot.SpringBootApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@RestController
public class DemoApplication{
    //main method of starting execution
    public static void main(String args[]){
springApplication.run(DemoApplication.class, args);
    }
    @GetMapping('/hello')
    //response to request
    public String hello(@RequestParam(value="name", defaultValue='World') String name){
        return String.format('Hello %s', name);
    }
}