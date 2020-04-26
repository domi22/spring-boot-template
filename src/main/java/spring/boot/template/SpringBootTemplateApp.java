package spring.boot.template;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"spring.boot.common.function.mapper"})
public class SpringBootTemplateApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTemplateApp.class);
    }
}
