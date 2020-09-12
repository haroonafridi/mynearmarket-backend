package com.mynearmarket.entities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@SpringBootApplication
@RestController
public class ApplicationLauncher {
    public static final int MIN_VALUE = -999_999_1;
    public static void main(String[] args) {
        System.out.println(Boolean.logicalAnd(true,true));
        int y=4;
        int x = (y==3)?3:4;
        Boolean b = Boolean.TRUE;
        Objects.nonNull(y);


        List<String> s = new ArrayList<>();
        List<String> t = new ArrayList<>(s);

        SpringApplication.run(ApplicationLauncher.class, args);
    }

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello";
    }
}
