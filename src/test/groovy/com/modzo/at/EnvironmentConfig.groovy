package com.modzo.at

import javax.annotation.PostConstruct

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component
import org.springframework.validation.annotation.Validated

import groovy.util.logging.Slf4j

@Component
@ConfigurationProperties(prefix = 'application.environment')
@Validated
@Slf4j
class EnvironmentConfig {

    String url

    @PostConstruct
    void printValues() {
        log.info('Environment configuration:')
        this.properties
            .each { property -> log.info("${property.key} = `${property.value}`") }
    }

}
