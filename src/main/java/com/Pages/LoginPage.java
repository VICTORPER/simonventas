package com.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//@DefaultUrl("http://10.1.20.15:2082/SimonQuotation/login.html")
public class LoginPage extends PageObject  {
    @FindBy(xpath = "//button[@type='submit' and contains(@class, 'btn btn-success')]")
    WebElement btnlogin;


    public void btnLogin(){
        btnlogin.click();
    }


}
