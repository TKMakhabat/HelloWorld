package com.example.HelloWorld;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HelloWorldApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = new
                AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        MessageRenderer mr = ctx.getBean(
                "renderer", MessageRenderer.class);
        mr.render();
    }

}
