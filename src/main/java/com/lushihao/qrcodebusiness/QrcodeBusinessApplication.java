package com.lushihao.qrcodebusiness;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lushihao.qrcodebusiness.dao")
public class QrcodeBusinessApplication {

    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "false");
        SpringApplication.run(QrcodeBusinessApplication.class, args);
    }

}
