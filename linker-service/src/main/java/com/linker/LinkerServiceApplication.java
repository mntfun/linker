package com.linker;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * spring boot 启动文件
 *
 * Created by dentalulcer on 05/07/2018.
 */
@ServletComponentScan
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.linker.dao")
public class LinkerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LinkerServiceApplication.class, args);

    }

}
