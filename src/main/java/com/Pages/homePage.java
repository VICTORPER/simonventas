package com.Pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class homePage extends PageObject {
    @FindBy(xpath = "//span[contains(@class, 'hidden-phone') and text()='Wilson Enrique Sacristan Vaca']\n")
    WebElement txtMessage;
    @FindBy(css = "a.arrow span.hidden-tablet")
    WebElement btnConsultaCotizaciones;
    @FindBy(css = "a[href='quotationConsultation.do']\n")
    WebElement btnConsultaCotizacionxrango;
    @FindBy(css = "span.hidden-tablet")
    List<WebElement> hiddenTabletElements;
    @FindBy(css = "a[href='vidaHomeAgentPortafolio.do']")
    WebElement portafolioTranquilidadEnVidaLink;

    @FindBy(css = "input[type='button'][value='Siguiente']")
     WebElement btnSiguiente;
    public boolean isDisplayed(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10); // Espera de 10 segundos

        wait.until(ExpectedConditions.visibilityOf(txtMessage));
        return txtMessage.isDisplayed();
    }

    public WebElement btnConsultaCotizaciones(){

        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.hidden-tablet")));
        for (WebElement element : hiddenTabletElements) {
            if (element.getText().equals("Consulta Cotizaciones")) {
                element.click();
                return element;
            }
        }
        return null;  }

    public void btnConsultaCotizacionxrango(){
        btnConsultaCotizacionxrango.click();
    }

    public WebElement btncotizadoresVida(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.hidden-tablet")));
        for (WebElement element : hiddenTabletElements) {
            if (element.getText().equals("Cotizadores Vida")) {
               element.click();
               return element;
            }
        }
        return null;  }

    public void btnportafolioTranquilidadEnVida(){

        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        portafolioTranquilidadEnVidaLink.click();   }

    public void btnSiguiente(){
        btnSiguiente.click();
    }
    }

