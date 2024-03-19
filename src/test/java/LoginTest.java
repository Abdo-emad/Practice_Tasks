import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends TestBase{
    SoftAssert softAssert;

    @Test
    public void LoginWithInvalidData() {                                                     // This Method used to Check Login Functionality with invalid credentials
      try {
          loginPage.clearPhoneNumberField();                                                   // Clear placeholder from phone number field
          loginPage.setPhoneNumber("01023875888");                                             //Enter invalid phone number
          loginPage.clearPasswordField();                                                      // Clear placeholder password field
          loginPage.setPassword("P@ssw0rd");                                                    //Enter invalid password
          loginPage.clickOnLoginButton();                                                        //Click on the login button
          wait.until(ExpectedConditions.visibilityOfElementLocated(loginPage.errorMessage));   //Used Explicit wait here to wait specific element to appear like "error Message"
          String actualErrorMessage= "Invaild user name or password";                              //Put actual result [error message] in variable
          String expectedErrorMessage= loginPage.getErrorMessage();                                        //Get expected error message
          softAssert = new SoftAssert();                                                       //Used soft assertion to validate the expected result [error message] against actual result
          softAssert.assertTrue(actualErrorMessage.contains(expectedErrorMessage));
          softAssert.assertAll();
      }catch (Exception e){
          e.printStackTrace();
      }

    }
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("invalid login")
    @Link(name = "Jira" , url = "https://google.com")
    public void LoginWithInvalidData2() {                                                     // This Method used to Check Login Functionality with invalid credentials
        try {
            loginPage.clearPhoneNumberField();                                                   // Clear placeholder from phone number field
            loginPage.setPhoneNumber("01023875888");                                             //Enter invalid phone number
            loginPage.clearPasswordField();                                                      // Clear placeholder password field
            loginPage.setPassword("P@ssw0rd");                                                    //Enter invalid password
            loginPage.clickOnLoginButton();                                                        //Click on the login button
            wait.until(ExpectedConditions.visibilityOfElementLocated(loginPage.errorMessage));   //Used Explicit wait here to wait specific element to appear like "error Message"
            String actualErrorMessage= "Invaild user name or password";                              //Put actual result [error message] in variable
            String expectedErrorMessage= loginPage.getErrorMessage();                                        //Get expected error message
            softAssert = new SoftAssert();                                                       //Used soft assertion to validate the expected result [error message] against actual result
            softAssert.assertFalse(actualErrorMessage.contains(expectedErrorMessage));
            softAssert.assertAll();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
