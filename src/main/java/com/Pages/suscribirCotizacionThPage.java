package com.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class suscribirCotizacionThPage extends PageObject {

    @FindBy(xpath = "//input[@id='formalizeVida']")
    WebElement btnSuscribir;

    public void btnSuscribir() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOf(btnSuscribir));
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", btnSuscribir);
        //Thread.sleep(20000);
    }

}
