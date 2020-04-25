package com.vinicius.page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.vinicius.core.CorePage;
import com.vinicius.driver.TLDriverFactory;
public class PageToMove extends CorePage<PageToMove> {

    @FindBy(xpath = "//*[@id=\"fourth\"]")
    private WebElement labelFourth;
    @FindBy(id = "credit2")
    private WebElement labelBank;
    @FindBy(id = "credit1")
    private WebElement labelSales;
    @FindBy(id = "equal")
    private WebElement labelSucess;
    @FindBy(xpath = "//*[@id=\"bank\"]")
    private WebElement labelDebitAccount;
    @FindBy(xpath = "//*[@id=\"amt7\"]")
    private WebElement labelDebitAmount;
    @FindBy(xpath = "//*[@id=\"loan\"]")
    private WebElement labelCreditAccount;
    @FindBy(xpath = "//*[@id=\"amt8\"]")
    private WebElement labelCreditAmount;

    public PageToMove(){
        this.driver = TLDriverFactory.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    public void ToMove(){

    	 Actions actions = new Actions(this.driver);
         Action move = null;

         move = actions.clickAndHold(labelBank).moveToElement(labelDebitAccount).release().build();
         move.perform();

         move = actions.clickAndHold(labelSales).moveToElement(labelCreditAccount).release().build();
         move.perform();

         move = actions.clickAndHold(labelFourth).moveToElement(labelDebitAmount).release().build();
         move.perform();

         move = actions.clickAndHold(labelFourth).moveToElement(labelCreditAmount).release().build();
         move.perform();

        

    }


}
