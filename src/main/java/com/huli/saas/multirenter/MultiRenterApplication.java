package com.huli.saas.multirenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author libinglong HLJF0921
 * <a href="mailto:libinglong@huli.com">libinglong:libinglong@huli.com</a>
 * @since 2019/11/19
 */
@EnableCaching
@SpringBootApplication
public class MultiRenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultiRenterApplication.class, args);
    }

}
