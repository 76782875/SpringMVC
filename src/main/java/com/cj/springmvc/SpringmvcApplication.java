package com.cj.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//@SpringBootApplication
//public class SpringmvcApplication {
//
//    public static void main(String[] args) {
//        SpringApplication.run(SpringmvcApplication.class, args);
//    }
//
//}


//jsp模式
@SpringBootApplication
@ServletComponentScan
public class SpringmvcApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringmvcApplication.class, args);
    }

}
