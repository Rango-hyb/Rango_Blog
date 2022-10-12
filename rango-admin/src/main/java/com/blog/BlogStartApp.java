package com.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动程序
 *
 * @author Rango
 */
@SpringBootApplication
public class BlogStartApp {

    public static void main(String[] args){
        SpringApplication.run(BlogStartApp.class, args);
        System.err.println("项目启动成功...");
    }
}
