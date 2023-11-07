package com.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class cotizacionThPage extends PageObject {

    @FindBy(xpath = "//input[@name='codAgente']")
    WebElement codAgenteInput;

    @FindBy(xpath = "//input[@id='nombreAsesorDiv']")
    WebElement asesor;
    @FindBy(css = "select#planTypePortaFplio")
    WebElement tranquilidadHijosOption;
    @FindBy(xpath = "//input[@name='numeroDocumento954Tomador']")
    WebElement numeroDocumentoInput;
    @FindBy(css = "select[name='tipoDocumento']")
    WebElement tipoDocumentoAseSelect;
    @FindBy(xpath = "//input[@name='numeroDocumento']")
    WebElement numeroDocumentoAseInput;
    @FindBy(xpath = "//input[@id='codCiudadVida954Tomador']")
    WebElement codCiudadVidaInput;
    @FindBy(css = "label.handle-cbx[for='autorizaDatosCheck954Tomador']")
    WebElement autorizaDatosLabel1;
    @FindBy(css = "label.handle-cbx[for='autorizaDatosCheck954Asegurado']")
    WebElement autorizaDatosLabel2;
    @FindBy(css = "input[type='button'][id='continuarUSO']")
    WebElement continuarButton;
    @FindBy(xpath = "//input[@name='amparoBasico']")
    WebElement amparoBasicoInput;
    @FindBy(xpath = "//input[@id='liquidarBtn954Prd']")
    WebElement btnliquidar;
    @FindBy(css = "a.ui-corner-all")
    List<WebElement> aElement;
    @FindBy(xpath = "//input[@id='submitbutton']")
    WebElement btnCrearCotizacion;
    public void codAgenteInput (String codAgent) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        codAgenteInput = wait.until(ExpectedConditions.visibilityOf(codAgenteInput));
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        codAgenteInput.clear();
        executor.executeScript("arguments[0].value = arguments[1];", codAgenteInput, codAgent);
        codAgenteInput.sendKeys(Keys.TAB);
        Thread.sleep(5000);
    }
    public void tranquilidadHijosOption(String producto){
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        Select select = new Select(tranquilidadHijosOption);
        select.selectByVisibleText(producto); }
    public void numeroDocumentoInput(String numerodeidentificaciontom){
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        numeroDocumentoInput = wait.until(ExpectedConditions.visibilityOf(numeroDocumentoInput));
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].value = arguments[1];", numeroDocumentoInput, numerodeidentificaciontom);
        numeroDocumentoInput.sendKeys(Keys.TAB);
    }
    public void tipoDocumentoAseOption(String tipodocumentoase){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        Select select = new Select(tipoDocumentoAseSelect);
        select.selectByVisibleText(tipodocumentoase); }
    public void numeroDocumentoAseInput(String numerodeidentificacionase){
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        numeroDocumentoAseInput = wait.until(ExpectedConditions.visibilityOf(numeroDocumentoAseInput));
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].value = arguments[1];", numeroDocumentoAseInput, numerodeidentificacionase);
        numeroDocumentoAseInput.sendKeys(Keys.TAB);
    }
    public void codCiudadTomadorInput(String ciudad){
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        codCiudadVidaInput = wait.until(ExpectedConditions.visibilityOf(codCiudadVidaInput));
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].value = arguments[1];", codCiudadVidaInput, ciudad);
        codCiudadVidaInput.sendKeys(Keys.ENTER);
        //return null;  }

    }
    public void autorizaDatosCheckTomador()  {

        WebDriverWait wait = new WebDriverWait(getDriver(), 80);

        wait.until(ExpectedConditions.elementToBeClickable(autorizaDatosLabel1));
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", autorizaDatosLabel1);
        executor.executeScript("arguments[0].click();", continuarButton);
    }
    public void autorizaDatosCheckAsegurado() {

        WebDriverWait wait = new WebDriverWait(getDriver(), 80);

        wait.until(ExpectedConditions.elementToBeClickable(autorizaDatosLabel2));
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", autorizaDatosLabel2);
        executor.executeScript("arguments[0].click();", continuarButton);

    }
    public void amparoBasicoInput(String amparobasico){
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        amparoBasicoInput = wait.until(ExpectedConditions.visibilityOf(amparoBasicoInput));
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].value = arguments[1];", amparoBasicoInput, amparobasico);
        amparoBasicoInput.sendKeys(Keys.TAB);
    }
    public void btnLiquidar() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        btnliquidar = wait.until(ExpectedConditions.visibilityOf(btnliquidar));
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", btnliquidar);
        Thread.sleep(2000);
    }

    public void btnCrearCotizacion() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        btnCrearCotizacion = wait.until(ExpectedConditions.visibilityOf(btnCrearCotizacion));
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", btnCrearCotizacion);
        Thread.sleep(2000);
    }
}
