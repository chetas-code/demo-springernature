package org.example.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.example.base.SelDriver;
import org.openqa.selenium.WebDriver;

public class Hook {

   public WebDriver driver ;

    @Before
    public void setUp()
    {
        System.out.println("Opening Browser");
        driver = new SelDriver().driverSetup();
    }

    @After
    public void tearDown()
    {
        System.out.println("Closing Browser");
        driver.quit();
    }

}
