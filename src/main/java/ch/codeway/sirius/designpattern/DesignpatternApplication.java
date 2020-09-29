package ch.codeway.sirius.designpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class DesignpatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignpatternApplication.class, args);
    }

}
