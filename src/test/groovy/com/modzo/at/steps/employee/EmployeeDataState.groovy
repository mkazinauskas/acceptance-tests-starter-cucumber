package com.modzo.at.steps.employee

import io.cucumber.spring.CucumberTestContext
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

@Component
@Scope(CucumberTestContext.SCOPE_CUCUMBER_GLUE)
class EmployeeDataState {

    String response

}
