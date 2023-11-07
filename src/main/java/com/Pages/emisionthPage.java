package com.Pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class emisionthPage extends PageObject {



    @FindBy(xpath = "//label[@class='handle-cbx' and @for='autorizaDatosCheck1']")
     WebElement autorizaDatosCheck1;

    @FindBy(css = "input[type='button'][id='continuarUSO']")
    WebElement continuarButton;

    @FindBy(css = "a.addTabindexing#addRowsLibre")
    WebElement addBenificiario;

    @FindBy(css = "select#tipoDocumentoLibre1")
    WebElement selectTipoDoc;

    @FindBy(css = "input#nroDocumentoLibre1")
    WebElement txtNumeroDocumento;

    @FindBy(css = "input#nombreLibre1")
    WebElement txtNombreBeneficiario;

    @FindBy(xpath = "//input[@id='apellido1']")
    WebElement txtApellidosBeneficiario;

    @FindBy(xpath = "//select[@id='sexo1']")
    WebElement selectSexoBen;

    @FindBy(xpath = "//select[@id='parentesco1']")
    WebElement selectParentescoBen;

    @FindBy(xpath = "//input[@id='participacionLibre1']")
    WebElement txtParticipacionBen;

    @FindBy(css = "input#totalLibre")
    WebElement inputTotalLibre;

    //@FindBy(css = "input#submitbutton")
    @FindBy(css = "input#submitbutton")
    WebElement btnGenerarPoliza;

    @FindBy(css = "input.btn.btn-success[value='Aceptar']")
    WebElement btnAceptar;

    @FindBy(css = "input#totalLibreOneroso.input-xmini[readonly='true']")
    WebElement totalLibreOneroso;

    public boolean isDisplayedEmision() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 200);

        try {
            // Esperar a que el elemento de confirmación esté visible
            WebElement txtMensaje = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2[align=\"center\"]")));

            // Desplazar la página hasta el elemento usando JavaScript
            ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);",txtMensaje);

            return txtMensaje.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void autorizaDatosCheck() {

            waitUntilPageLoaded();
            WebDriverWait wait = new WebDriverWait(getDriver(), 80);

        //if (!nombresAseg.isEmpty() && !apellidosAseg.isEmpty()) {

            wait.until(ExpectedConditions.elementToBeClickable(autorizaDatosCheck1));
            JavascriptExecutor executor = (JavascriptExecutor) getDriver();
            executor.executeScript("arguments[0].click();", autorizaDatosCheck1);
            executor.executeScript("arguments[0].click();", continuarButton);
        //} else {
            //System.out.println("La página no se ha cargado completamente");
        }
    //}

    public boolean waitUntilPageLoaded() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 80);
        try {
            wait.until(driver -> {
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                return executor.executeScript("return document.readyState").equals("complete");
            });
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }
       public void addButtonBeneficiario()
       {
         WebDriverWait wait = new WebDriverWait(getDriver(), 80);
         wait.until(ExpectedConditions.elementToBeClickable(addBenificiario));
         JavascriptExecutor executor = (JavascriptExecutor) getDriver();
         executor.executeScript("arguments[0].click();", addBenificiario);
        }

        public void selectTipoDoc(String tipodocumento)
          {
            WebDriverWait wait = new WebDriverWait(getDriver(), 80);
            Select select = new Select(selectTipoDoc);
            select.selectByVisibleText(tipodocumento);
          }
         public void txtNumeroDocumento(String numerodocumento) {
             WebDriverWait wait = new WebDriverWait(getDriver(), 1000); // Espera de 10 segundos

             wait.until(ExpectedConditions.visibilityOf(txtNumeroDocumento));
             JavascriptExecutor executor = (JavascriptExecutor) getDriver();
             executor.executeScript("arguments[0].value = arguments[1];", txtNumeroDocumento, numerodocumento);

         }

         public void txtNombreBeneficiario(String nombres)
          {
             WebDriverWait wait = new WebDriverWait(getDriver(), 80);
             txtNombreBeneficiario = wait.until(ExpectedConditions.visibilityOf(txtNombreBeneficiario));
             JavascriptExecutor executor = (JavascriptExecutor) getDriver();
             executor.executeScript("arguments[0].value = arguments[1];", txtNombreBeneficiario, nombres);
          }

         public void txtApellidosBeneficiario(String apellidos)
          {
            WebDriverWait wait = new WebDriverWait(getDriver(), 80);
            txtApellidosBeneficiario = wait.until(ExpectedConditions.visibilityOf(txtApellidosBeneficiario));
            JavascriptExecutor executor = (JavascriptExecutor) getDriver();
            executor.executeScript("arguments[0].value = arguments[1];", txtApellidosBeneficiario, apellidos);
         }
         public void selectSexoBen(String sexoBen)
         {
            WebDriverWait wait = new WebDriverWait(getDriver(), 80);
            Select select = new Select(selectSexoBen);
            select.selectByVisibleText(sexoBen);
         }
         public void selectParentescoBen(String parentesco)
          {
            WebDriverWait wait = new WebDriverWait(getDriver(), 80);
            Select select = new Select(selectParentescoBen);
            select.selectByVisibleText(parentesco);
          }

       public void txtParticipacionBen(String participacion)
        {
        WebDriverWait wait = new WebDriverWait(getDriver(), 80);
        txtParticipacionBen = wait.until(ExpectedConditions.visibilityOf(txtParticipacionBen));
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].value = arguments[1];", txtParticipacionBen, participacion);
        executor.executeScript("arguments[0].dispatchEvent(new KeyboardEvent('keydown', {key: 'ArrowDown'}));", txtParticipacionBen);
        executor.executeScript("arguments[0].value = arguments[1];", inputTotalLibre, participacion);
        executor.executeScript("arguments[0].value = arguments[1];", totalLibreOneroso, participacion);

        }

    public void btnGenerarPoliza() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 80);

        // Variables para almacenar los valores de "nombres" y "apellidos"
        String nombresAseg;
        String apellidosAseg;

        do {
            // Esperar a que los campos "nombres" y "apellidos" tengan información no vacía
            wait.until(ExpectedConditions.not(ExpectedConditions.attributeToBe(By.cssSelector("input#nombresAseg"), "value", "")));
            wait.until(ExpectedConditions.not(ExpectedConditions.attributeToBe(By.cssSelector("input#apellidosAseg"), "value", "")));

            // Obtener los valores actualizados de "nombres" y "apellidos"
            WebElement nombresAsegInput = getDriver().findElement(By.cssSelector("input#nombresAseg"));
            WebElement apellidosAsegInput = getDriver().findElement(By.cssSelector("input#apellidosAseg"));
            nombresAseg = nombresAsegInput.getAttribute("value");
            apellidosAseg = apellidosAsegInput.getAttribute("value");

            // Esperar a que el botón "Generar póliza" sea clickable
            WebElement btnGenerarPoliza = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#submitbutton")));

            // Hacer clic en el botón "Generar póliza" usando JavascriptExecutor
            JavascriptExecutor executor = (JavascriptExecutor) getDriver();
            executor.executeScript("arguments[0].click();", btnGenerarPoliza);

            // Esperar a que los campos "nombres" y "apellidos" tengan información actualizada
            wait.until(ExpectedConditions.not(ExpectedConditions.attributeToBe(By.cssSelector("input#nombresAseg"), "value", "")));
            wait.until(ExpectedConditions.not(ExpectedConditions.attributeToBe(By.cssSelector("input#apellidosAseg"), "value", "")));

        } while (nombresAseg.isEmpty() && apellidosAseg.isEmpty());
    }

       public void btnAceptar()
       {
        WebDriverWait wait = new WebDriverWait(getDriver(), 100000);
        btnAceptar = wait.until(ExpectedConditions.visibilityOf(btnAceptar));
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", btnAceptar);
       }
    public boolean isDisplayedEmisionOK() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);

        try {
            // Esperar a que el elemento de confirmación esté visible
            WebElement txtMensaje = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span#errorSubmit.alert.alert-danger")
            ));

            // Desplazar la página hasta el elemento usando JavaScript
            ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);",txtMensaje);

            return txtMensaje.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
