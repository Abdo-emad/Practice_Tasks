import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
    public WebDriver driver;
   public WebDriverWait wait;
 LoginPage loginPage;

    @BeforeMethod                                                                     //This Method used to open browser then navigate the login page
    public void openBrowser(){
        WebDriverManager.edgedriver().setup();
        driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://stage.glamera.com/");                                      //Navigate to page by url
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));           //Implicit Wait used here to wait all page elements to appear
        wait= new WebDriverWait(driver,Duration.ofSeconds(10000));
        loginPage = new LoginPage(driver,wait);                                      // used an object from "login page" to access the "LoginPage" class  to be able to access methods inside it



    }

    @AfterMethod                                                                        //This Method used to Close browser after running the Test Method [Login with Invalid credentials]
    public void tearDown(){
        driver.quit();  // close browser
    }
}
