package rechard.learn.springboot.springstatemachine.demo.groupadd;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class BootStrap {

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(BootStrap.class);
        builder.run(args);
    }
}
