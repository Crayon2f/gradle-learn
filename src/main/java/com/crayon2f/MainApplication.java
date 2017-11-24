package com.crayon2f;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Import;

/**
 * Created by feiFan.gou on 2017/11/24 17:25.
 */
@ServletComponentScan
@Import(SpringBootApplication.class)
@SpringBootApplication(scanBasePackages = {"com.crayon2f"})
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
