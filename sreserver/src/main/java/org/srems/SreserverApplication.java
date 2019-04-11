package org.srems;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("org.srems.mappers")
@EnableCaching
public class SreserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(SreserverApplication.class, args);
    }

}
