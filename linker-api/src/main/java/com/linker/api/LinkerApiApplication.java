package com.linker.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by dentalulcer on 05/07/2018.
 */
@ServletComponentScan(basePackages = {"com.linker.api.filter"})
@SpringBootApplication(scanBasePackages = {"com.linker.api.controller", "com.linker.api.exception", "com.linker.service.impl"})
@EnableTransactionManagement
@MapperScan("com.linker.dao")
public class LinkerApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LinkerApiApplication.class, args);
    }

}
