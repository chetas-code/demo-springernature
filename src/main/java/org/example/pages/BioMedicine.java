package org.example.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BioMedicine {

    WebDriver driver;

    @FindBy(css="a[title='follow this link to go to Biomedicine']")
    private WebElement bioMedicineLink;

    @FindBy(css="img[alt='Logo SpringerLink']")
    private WebElement springerLogo;

    public BioMedicine(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public boolean checkSpringerLogo(){
        boolean test =  springerLogo.isDisplayed();
        return springerLogo.isDisplayed();
    }

    public void clickBioMedicineLink(){
        bioMedicineLink.click();
    }


}
