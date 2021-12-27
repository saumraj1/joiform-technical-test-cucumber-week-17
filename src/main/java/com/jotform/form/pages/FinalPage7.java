package com.jotform.form.pages;

import com.jotform.form.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalPage7 extends Utility {

    private static final Logger log = LogManager.getLogger(FinalPage7.class.getName());

    public FinalPage7() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='jfThankYou-description form-subHeader']")
    WebElement verificationText;

    public void verifyThatSubmissionHasBeenReceived(String expectedMessage){
       log.info("Verifying the submission message: " + verificationText.toString() + "<br>");
        String actualMessage = getTextFromElement(verificationText);
        verifyElementsJU("Incorrect submission",expectedMessage,actualMessage );
    }


}
