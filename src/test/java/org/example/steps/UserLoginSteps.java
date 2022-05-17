package org.example.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pages.UserLogin;
import org.junit.Assert;

public class UserLoginSteps {

    public Hook hook;
    public UserLogin userLogin;
     public UserLoginSteps(Hook hook){
            this.hook=hook;
            userLogin = new UserLogin((hook.driver));
        }

     @Given("^I am on login page$")
     public void iAmOnLoginPage() {
         userLogin.clickSignIn();
     }

    @When("^I enter (.*) and (.*)$")
    public void iEnterUsernameAndPassword(String username,String password) {
         userLogin.enterEmailPassword(username,password);
    }

    @And("^I click on login$")
    public void iClickOnLogin() {
         userLogin.clickOnLogin();
    }


    @Then("^I am on profile homepage$")
    public void iAmOnProfileHomepage() {
        Assert.assertTrue(userLogin.checkSpringerNatureLogo());
    }


    @And("^I should see my name on profile page$")
    public void iShouldSeeMyNameOnProfilePage() {
         Assert.assertEquals("Rachana Mulye", userLogin.checkUserProfileName());
    }



    @Then("^I should see validation message$")
    public void iShouldSeeValidationMessage() {
         String message= "Unfortunately the details you supplied do not match our records. Please check and try again";
         Assert.assertEquals(userLogin.checkLoginValidationMessage(),message);
    }

    @When("^I click on logout$")
    public void iClickOnLogout() {
         userLogin.clickLogout();
    }


    @Then("^I am on landing page$")
    public void iAmOnLandingPage() {
       Assert.assertTrue(userLogin.checkUserSignOff());
    }

    @When("^I provide wrong username and password$")
    public void iProvideWrongUsernameAndPassword() {
       userLogin.enterEmailPassword("rachana@gmail.com","test121");
    }
}
