[![Build Status](https://travis-ci.org/modestukasai/acceptance-tests-starter-cucumber.svg?branch=master)](https://travis-ci.org/modestukasai/acceptance-tests-starter-cucumber)

# Acceptance test starter (Cucumber)

## How to run

### Default
This will run project with default settings. Properties will be used from resources folder.
`featuresPath=`, `tags='not @Ignore'`. If you want to see more, please check `gradle/cucumber/cucumber.gradle` file.
* Execute `./gradlew runCucumberTests`

### Parameterised
Please note: all application properties can be passed via `-P` parameter.
* Execute `./gradlew runCucumberTests -PfeaturesPath='[some path]' -Ptags='[tags]' -Papplication.environment.url='[some url]'`