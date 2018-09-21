package com.boraji.tutorial.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;

@RestController
public class HelloWorldController {

   private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

   @RequestMapping("/")
   public String sayHello() {

      try (Writer writer = new BufferedWriter(new OutputStreamWriter(
              new FileOutputStream("/home/vcap/test.txt"), "utf-8"))) {
         writer.write("testing");
      }catch (IOException ex) {
         // Report
      }

      return "Hello Spring Boot!!";
   }
}
