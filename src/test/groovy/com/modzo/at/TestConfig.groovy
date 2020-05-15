package com.modzo.at

import groovy.util.logging.Slf4j
import io.cucumber.java.Before
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
@Slf4j
class TestConfig {

    @SpringBootApplication
    @EnableConfigurationProperties
    static class AcceptanceApplication {

        static void main(String[] args) {
            SpringApplication.run(AcceptanceApplication, args)
        }

    }

    @Before
    void setUp() {
        log.info('Initializing spring test context')
    }

}
