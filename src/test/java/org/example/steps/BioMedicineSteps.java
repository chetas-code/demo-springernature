package org.example.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pages.BioMedicine;
import org.junit.Assert;

public class BioMedicineSteps {

    public Hook hook;
    public BioMedicineSteps(Hook hook){
        this.hook=hook;
    }
    public BioMedicine bioMed = new BioMedicine(hook.driver);

    @Given("^I am on home page$")
    public void iAmOnHomePage() {
        Assert.assertEquals(bioMed.checkSpringerLogo(),true);
    }

    @When("^I click on biomedicine link$")
    public void iClickOnBiomedicineLink() {
        bioMed.clickBioMedicineLink();
    }

    @Then("^I am on biomedicine page$")
    public void iAmOnBiomedicinePage() {
    }
    
}
