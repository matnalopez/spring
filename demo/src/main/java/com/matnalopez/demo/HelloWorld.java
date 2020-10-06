package com.matnalopez.demo;

import org.joda.time.LocalTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorld {

  @RequestMapping("/")
  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);
    System.out.println(HelloWorld.sayHello());
  }

  @RequestMapping("/puto")
  public static String puto(){
    return "Puto";
  }

  @RequestMapping("/gato")
  public static String gato(){
    return "Gato";
  }



  public static String sayHello() {
    return "Hello world!";
  }
}
