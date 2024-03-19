selenium-testng
A sample selenium, testng and maven project to login, load a page and add few assertions.
Steps to run -
First step:
1-navigate to the "LoginTest" page then navigate to the method which called "LoginWithInvalidData" , click on the "run" button [on the left side] besides the function 
Second Step:
2-Navigate to the "Run" button on the IDE bar [top side] besides the "debug" icon

Project sections:
1-Class with name "Login Page" >> this class contains the login page locators 
2-Class with name "TestBase"  >>  this class contains the BeforMethod which open chrome browser then navigate to the web page URL & contains the "AfterMethod" which will close browser after running the "Test" method
3-Class with name "LoginTest"  >>  this class contains the Test Function "Verify Login Function" with invalid credentials & contains also the assertion between the expected result & actual result