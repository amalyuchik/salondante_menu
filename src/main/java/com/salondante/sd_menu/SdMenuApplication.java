package com.salondante.sd_menu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.salondante.sd_menu.dao")
@SpringBootApplication
public class SdMenuApplication {

    public static void main(String[] args) {
        SpringApplication.run(SdMenuApplication.class, args);
    }

}
