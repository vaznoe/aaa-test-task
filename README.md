# AAA-test-task
Here is the exercise: 
 `automate basic flow of member joining AAA.
 Go to https://www.calif.aaa.com/
 Select “Join AAA”
 Select membership (only one option)
 Fulfil all required forms (member info, contact details, additional members, membership options)
 Go to payment page
 Open payment method window and close it
 Submit payment
 Verify error appears “Payment Method is required.”
 Make automated test that covers at least 2 users: male and female`

######==================================================
Selenide/Selenium | Java | TestNG | Maven | Allure Report

Selenide - (http://selenide.org/documentation.html), Allure - (https://github.com/allure-framework/allure2)
 
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