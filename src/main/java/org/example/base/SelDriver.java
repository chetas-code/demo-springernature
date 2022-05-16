package org.example.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class SelDriver {

    private  WebDriver driver;

   /*
     Returns a WebDriver with homepage open
     @return Selenium WebDriver
    */
    public WebDriver driverSetup(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=C:\\Users\\racha\\AppData\\Local\\Google\\Chrome\\User Data\\SelProf");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://link.springer.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver;
    }

    // This methods quit and closes all the running sessions.
    public void  driverQuit(){
        driver.quit();
    }
}
