**Boilerplate**

* Spring boot
* Multi module gradle build
* API contract tests with api blueprint and dredd
* Docker build
* Checkstyle, findbugs, PMD

*Build*

```./gradlew clean build```

*Docker build*

```./gradlew clean buildDocker```

*Run contract tests*

```./gradlew clean runContractTest```

*Run application*

```./gradlew clean bootRun```