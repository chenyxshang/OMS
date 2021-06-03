package cn.chenyx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("cn.chenyx.mapper")
@SpringBootApplication
public class OMSApplication {
    public static void main(String[] args) {
        SpringApplication.run(OMSApplication.class, args);
    }
}
