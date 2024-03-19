
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    public WebDriver driver;
    public WebDriverWait wait;
    public LoginPage(WebDriver driver, WebDriverWait wait){   // login page constructor
        this.driver = driver;
        this.wait = wait;
    }

    By phoneNumber = By.xpath("//input[@formcontrolname=\"UserName\"]");       // locate the phone number field then add it in a variable to use it again
    By password = By.xpath("//input[@formcontrolname=\"Password\"]");           // locate the password field then add it in a variable to use it again
    By loginButton = By.xpath("//button[@type=\"submit\"]");                     // locate the login button then add it in a variable to use it again
    By errorMessage = By.xpath("//div[@id=\"toast-container\"]");                // locate the error message then add it in a variable to use it again
    public void clearPhoneNumberField(){                                                        // This Method Used to clear the Phone Number Field placeholder
        driver.findElement(phoneNumber).clear();
    }

    public void setPhoneNumber(String phone){                                                      // This Method Used to Set the Phone Number Input Value
        driver.findElement(phoneNumber).sendKeys(phone);
    }

    public void clearPasswordField(){                                                              // This Method Used to clear the Password Field placeholder
        driver.findElement(password).clear();
    }

    public void setPassword(String pass){
        driver.findElement(password).sendKeys(pass);                                              // This Method Used to Set the Password Input Value
    }

    public void clickOnLoginButton(){
        driver.findElement(loginButton).click();                                                  // This Method Used to click on the Login button
    }

    public String getErrorMessage(){
       return driver.findElement(errorMessage).getText();                                          // This Method Used to get error Message which appear while login with wrong credentials
    }
}
