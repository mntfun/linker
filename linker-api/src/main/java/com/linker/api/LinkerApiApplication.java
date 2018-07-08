package com.linker.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Created by dentalulcer on 05/07/2018.
 */
@ServletComponentScan(basePackages = {"com.linker.api.filter"})
@SpringBootApplication(scanBasePackages = {"com.linker.api.controller", "com.linker.api.exception"})
public class LinkerApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LinkerApiApplication.class, args);
    }

}
