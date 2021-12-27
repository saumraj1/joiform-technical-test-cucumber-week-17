package com.jotform.form.steps;

import com.jotform.form.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.awt.*;

public class TechnicalTestSteps {
    @Given("^User is on the jotform webpage$")
    public void userIsOnTheJotformWebpage() {
    }

    @When("^User clicks on the next button from the home page$")
    public void userClicksOnTheNextButtonFromTheHomePage() {
        new HomePage1().clickOnNextButton();
    }

    @And("^enters first name \"([^\"]*)\" in the first name field$")
    public void entersFirstNameInTheFirstNameField(String name)  {
        new TestFormPage2().enterFirstNameInTheFirstNameField(name);

    }

    @And("^enters last name \"([^\"]*)\" in the last name field$")
    public void entersLastNameInTheLastNameField(String lastname)  {
        new TestFormPage2().enterLastNameInTheLastNameField(lastname);

    }

    @And("^clicks on the next button on the Test Form Page$")
    public void clicksOnTheNextButtonOnTheTestFormPage() {
        new TestFormPage2().clickOnNextButtonOnTestFormPage();
    }

    @And("^attaches a file$")
    public void attachesAFile() throws AWTException {
        new BrowseAndDropFilesPage3().uploadFile("C:\\Users\\laxmi\\Desktop\\TestDoc.docx");
    }

    @And("^creates a signature$")
    public void createsASignature() throws InterruptedException {
        new SignaturePage4().createSignature();
    }

    @And("^clicks on the next button on the signature page$")
    public void clicksOnTheNextButtonOnTheSignaturePage() {
        new SignaturePage4().clickOnNextButton();
    }

    @And("^selects the date$")
    public void selectsTheDate() {
        new DatePage5().selectDate();

    }

    @And("^clicks on the next button on the date page$")
    public void clicksOnTheNextButtonOnTheDatePage() {
        new DatePage5().clickOnNext();
    }

    @And("^selects the security question \"([^\"]*)\" from the dropdown$")
    public void selectsTheSecurityQuestionFromTheDropdown(String question)  {
        new SecurityQuestionPage6().selectFromDropDown(question);

    }

    @And("^answers the security question \"([^\"]*)\"$")
    public void answersTheSecurityQuestion(String answer)  {
        new SecurityQuestionPage6().enterSecurityAnswer(answer);

    }

    @And("^clicks on the submit button$")
    public void clicksOnTheSubmitButton() {
        new SecurityQuestionPage6().clickOnSubmitButton();
    }

    @Then("^verifies that the submission has been received \"([^\"]*)\"$")
    public void verifiesThatTheSubmissionHasBeenReceived(String message)  {
        new FinalPage7().verifyThatSubmissionHasBeenReceived(message);

    }
}
