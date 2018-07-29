# AAA-test-task
Selenide/Selenium | Java | TestNG | Maven | Allure Report

[Selenide] (http://selenide.org/documentation.html), [Allure] (https://github.com/allure-framework/allure2)
 
```bash
brew install chromedriver
```
```bash
brew install geckodriver
```

Test run chrome:
```bash
mvn clean test -Dbrowser=chrome
```
Test run firefox:
```bash
mvn clean test -Dbrowser=firefox
````
Run allure report:
```bash
mvn allure:serve
```