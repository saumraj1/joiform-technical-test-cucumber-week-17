package com.jotform.form.pages;

import com.jotform.form.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage1 extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage1.class.getName());

    public HomePage1() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#jfCard-welcome-start")
    WebElement nextButton;


    public void clickOnNextButton(){
        clickOnElement(nextButton);
        log.info("click on next button : " + nextButton.toString());

    }
}
