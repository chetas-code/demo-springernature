package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UserLogin {
     WebDriver driver;

     @FindBy(css= "div[class=\'cross-nav cross-nav--wide\'] a[class=\'register-link flyout-caption\']")
     private WebElement signIn;

     @FindBy(css="#login-box-email")
     private WebElement emailField;

     @FindBy(css="#login-box-pw")
     private WebElement passwordField;

     @FindBy(css="button[title='Log in']")
     private WebElement login;

     @FindBy(css="img[alt='Logo SpringerLink']")
     private WebElement springerNatureLogo;

     @FindBy(css="div[class='cross-nav cross-nav--wide'] div[class='auth flyout'] span")
     private WebElement userProfileName;

     @FindBy(css="div[role='alert']")
     private WebElement wrongLoginMessage;

     @FindBy(css="div[class='auth flyout is-open'] a[class='logout action']")
     private WebElement logOut;


    public UserLogin(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

     public void clickSignIn(){
         signIn.click();
     }

     public void enterEmailPassword (String email, String password){
         emailField.sendKeys(email);
         passwordField.sendKeys(password);
     }

     public void clickOnLogin(){
         login.click();
     }

     public boolean checkSpringerNatureLogo(){ return springerNatureLogo.isDisplayed();
     }

     public String checkUserProfileName(){
         //@rachanaM - added wait to avoid flakiness as test execution was pausing here
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(userProfileName));
        return userProfileName.getText();
     }

     public String checkLoginValidationMessage(){
        return wrongLoginMessage.getText();
     }

     public void clickLogout(){
        userProfileName.click();
        //@rachanaM - added wait to avoid flakiness as test execution was pausing here
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(logOut));
        logOut.click();
     }

     public boolean checkUserSignOff(){
        return signIn.isDisplayed();
     }


}
