package com.Pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class consultaCotizacionPage  extends PageObject {

    @FindBy(css = "select[id='company']")
    WebElement selectcompania;

    @FindBy(css = "select[id='seccion']")
    WebElement selectseccion;

    @FindBy(css = "select[id='product']")
    WebElement selectproducto;

    @FindBy(xpath= "//input[@name='fechaInicio']")
    WebElement txtfechadesde;

    @FindBy(xpath= "//input[@name='fechaFin']")
    WebElement txtfechahasta;

    @FindBy(xpath = "//input[@name='numDeCotizacion']")
    WebElement txtNumerodeCotizacion;

    @FindBy(xpath = "//input[@value='Consultar']")
    WebElement btnConsultar;

    @FindBy(xpath = "//a[contains(@onclick, 'getCotizacionDetails')]")
    WebElement linkcotizacion;

    @FindBy(xpath = "//label[contains(text(), 'Mostrar')]/select[@name='searchResult_length']")
    WebElement txtMessageQuery;

    @FindBy(id = "Imprimir")
    WebElement btnImprimir;

    @FindBy(xpath = "//a[@class='btn btn-success' and contains(@onclick, 'emitirFromCommonConsultation')]")
    WebElement btnEmitir;



    public void selectcompania(String compania){

        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        Select select = new Select(selectcompania);
        select.selectByVisibleText(compania); }

    public void selectseccion(String seccion){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        Select select = new Select(selectseccion);
        select.selectByVisibleText(seccion); }

    public void selectproducto(String producto){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        Select select = new Select(selectproducto);
        select.selectByVisibleText(producto); }

    public void txtFechainicio(String fechadesde)
    {
        txtfechadesde.clear();
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        txtfechadesde.sendKeys(fechadesde);
    }

    public void txtFechahasta(String fechahasta)
    {
        txtfechahasta.clear();
        txtfechahasta.sendKeys(fechahasta);
    }
    public void txtNumerodecotizacion(String numerodecotizacion){
        WebDriverWait wait = new WebDriverWait(getDriver(), 80);
        txtNumerodeCotizacion = wait.until(ExpectedConditions.visibilityOf(txtNumerodeCotizacion));
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].value = arguments[1];", txtNumerodeCotizacion, numerodecotizacion);
    }
    public void btnConsultar()
    {
        btnConsultar.click();
    }

    public void clickencotizacion(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", linkcotizacion);
    }
    public boolean txtConfirmacion() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);

        try {
            // Esperar a que el elemento de confirmación esté visible
            WebElement txtMensaje = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("headerId")));
            // Desplazar la página hasta el elemento usando JavaScript
            ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", txtMensaje);

            return txtMensaje.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isDisplayedQuery(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10); // Espera de 10 segundos
        wait.until(ExpectedConditions.visibilityOf(txtMessageQuery));
        return txtMessageQuery.isDisplayed();
    }
    public void btnImprimir() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        // Configurar la ubicación donde se guardará el archivo descargado
        String downloadPath = "C:\\Users\\Victor perez\\Downloads"; // Cambiar a la ruta correcta en tu sistema

        // Configurar las opciones de Chrome para la descarga
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions"); // Deshabilitar extensiones
        options.addArguments("--disable-popup-blocking"); // Deshabilitar bloqueo de ventanas emergentes
        // Configurar la ubicación de descarga del archivo
        options.addArguments("download.default_directory=" + downloadPath);
        btnImprimir.click();
        Thread.sleep(9000);
        wait.until((WebDriver driver) -> {
            File folder = new File(downloadPath);
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.getName().endsWith(".pdf")) {
                        return true;
                    }
                }
            }
            //driver.close();
            return false;
        });
    }
    public void btnEmitir(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", btnEmitir);
    }
}

