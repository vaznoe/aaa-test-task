# AAA-test-task
 
```bash
brew install chromedriver
```
```bash
brew install geckodriver
```
Test run:
```bash
mvn clean test -Dbrowser=${browser} 
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