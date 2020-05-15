package com.modzo.at

import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.runner.RunWith

@RunWith(Cucumber)
@CucumberOptions(
        features = 'classpath:features/',
        plugin = ['pretty', 'html:build/cucumber', 'json:build/cucumber.json'],
        strict = true
)
class CucumberRunner {

}
