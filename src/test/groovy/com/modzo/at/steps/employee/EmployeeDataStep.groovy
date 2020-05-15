package com.modzo.at.steps.employee

import static io.restassured.RestAssured.given

import org.apache.http.HttpStatus
import org.springframework.beans.factory.annotation.Autowired

import groovy.util.logging.Slf4j
import io.cucumber.java.en.When

@Slf4j
class EmployeeDataStep {

    @Autowired
    private com.modzo.at.EnvironmentConfig configuration

    @Autowired
    private EmployeeDataState state

    @When('user opens employee list')
    void userOpensEmployeeList() {
        String response = given()
            .get(configuration.url + 'employees')
            .then()
            .statusCode(HttpStatus.SC_OK)
            .extract()
            .response()
            .prettyPrint()

        state.response = response
    }

    @When('list contains {word}')
    void userContainsWord(String word) {
        assert state.response.contains(word)
    }

}
