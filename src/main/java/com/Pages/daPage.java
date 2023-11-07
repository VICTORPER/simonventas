package com.Pages;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class daPage extends PageObject {

    @FindBy(css = "input.conductor[id='30001754No'][value='No']")
    WebElement radioButtonquestion1;

    @FindBy(css = "input.conductor[id='30001758No'][value='No']")
    WebElement radioButtonquestion2;

    @FindBy(css = "input.conductor[id='30001736No'][value='No']")
    WebElement radioButtonquestion3;

    @FindBy(css = "input.conductor[id='30001761No'][value='No']")
    WebElement radioButtonquestion4;

    @FindBy(css = "input.conductor[id='30001829No'][value='No']")
    WebElement radioButtonquestion5;

    @FindBy(css = "input.conductor[id='30001765No'][value='No']")
    WebElement radioButtonquestion6;

    @FindBy(css = "input.conductor[id='30001762No'][value='No']")
    WebElement radioButtonquestion7;

    @FindBy(css = "input.conductor[id='30001764No'][value='No']")
    WebElement radioButtonquestion8;

    @FindBy(xpath = "//input[@name='30001766']")
    WebElement txtPeso;

    @FindBy(xpath = "//input[@id='30001767']")
    WebElement txtaltura;

    @FindBy(css = "input.conductor[id='30001781No'][value='No']")
    WebElement radioButtonquestion9;

    @FindBy(css = "input.conductor[id='30001782No'][value='No']")
    WebElement radioButtonquestion10;

    @FindBy(css = "input.conductor[id='20000903No'][value='No']")
    WebElement radioButtonquestion11;

    @FindBy(css = "input.conductor[id='20000904No'][value='No']")
    WebElement radioButtonquestion12;

    @FindBy(css = "input.conductor[id='30001127No'][value='No']")
    WebElement radioButtonquestion13;

    @FindBy(css = "input.conductor[id='30000923No'][value='No']")
    WebElement radioButtonquestion14;

    @FindBy(css = "input.conductor[id='30000924No'][value='No']")
    WebElement radioButtonquestion15;

    @FindBy(css = "input.conductor[id='20000926No'][value='No']")
    WebElement radioButtonquestion16;

    @FindBy(css = "input.conductor[id='20000927No'][value='No']")
    WebElement radioButtonquestion17;

    @FindBy(css = "input.conductor[id='30000936No'][value='No']")
    WebElement radioButtonquestion18;

    @FindBy(css = "input.conductor[id='30001032No'][value='No']")
    WebElement radioButtonquestion19;

    @FindBy(css = "input.conductor[id='30001622No'][value='No']")
    WebElement radioButtonquestion20;

    @FindBy(css = "input.conductor[id='30001107No'][value='No']")
    WebElement radioButtonquestion21;

    @FindBy(css = "input.conductor[id='30000680No'][value='No']")
    WebElement radioButtonquestion22;

    @FindBy(css = "input.conductor[id='30001081No'][value='No']")
    WebElement radioButtonquestion23;

    @FindBy(css = "input.conductor[id='30001302No'][value='No']")
    WebElement radioButtonquestion24;
    @FindBy(xpath = "//input[@id='submitbutton']")
    WebElement submitButton;
    @FindBy(css = "input#confirmDeclaration.btn.btn-primary")
    WebElement btnSi;
    @FindBy(css = "input#contDeclaration.btn.btn-primary")
    WebElement btnContinuarDa;
    @FindBy(xpath = "//h2[@align='center' and text()='COTIZACIÓN']")
    WebElement txtCotizacion;
    @FindBy(xpath = "//input[@value='Presentar']")
    WebElement txtMensaje;
    public boolean isDisplayedDA() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);

        try {
            // Esperar a que el elemento de confirmación esté visible
            WebElement txtMensaje = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Presentar']")));
            // Desplazar la página hasta el elemento usando JavaScript
            ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", txtMensaje);

            return txtMensaje.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public void radioButtonquestion1 (String preguntauno) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        try {
            WebElement opcionRespuesta = null;

            if (preguntauno.equals("Si")) {
                opcionRespuesta = radioButtonquestion1;
            } else if (preguntauno.equals("No")) {
                opcionRespuesta = radioButtonquestion1;
            }

            // Verificar si se encontró la opción de respuesta y hacer clic en ella
            if (opcionRespuesta != null) {
                wait.until(ExpectedConditions.visibilityOf(radioButtonquestion1));
                JavascriptExecutor executor = (JavascriptExecutor) getDriver();
                executor.executeScript("arguments[0].click();",opcionRespuesta);
            } else {
                System.out.println("No se encontró la opción de respuesta especificada.");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void radioButtonquestion2 (String preguntados) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        try {
            WebElement opcionRespuesta = null;

            if (preguntados.equals("No")) {
                opcionRespuesta = radioButtonquestion2;

            }else if (preguntados.equals("Si")) {
                opcionRespuesta = radioButtonquestion2;
            }

            // Verificar si se encontró la opción de respuesta y hacer clic en ella
            if (opcionRespuesta != null) {
                wait.until(ExpectedConditions.visibilityOf(radioButtonquestion2));
                JavascriptExecutor executor = (JavascriptExecutor) getDriver();
                executor.executeScript("arguments[0].click();",opcionRespuesta);
            } else {
                System.out.println("No se encontró la opción de respuesta especificada.");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void radioButtonquestion3 (String preguntatres) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        try {
            WebElement opcionRespuesta = null;

            if (preguntatres.equals("No")) {
                opcionRespuesta = radioButtonquestion3;

            }else if (preguntatres.equals("Si")) {
                opcionRespuesta = radioButtonquestion3;
            }

            // Verificar si se encontró la opción de respuesta y hacer clic en ella
            if (opcionRespuesta != null) {
                wait.until(ExpectedConditions.visibilityOf(radioButtonquestion3));
                JavascriptExecutor executor = (JavascriptExecutor) getDriver();
                executor.executeScript("arguments[0].click();",opcionRespuesta);
            } else {
                System.out.println("No se encontró la opción de respuesta especificada.");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void radioButtonquestion4 (String preguntacuatro) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        try {
            WebElement opcionRespuesta = null;

            if (preguntacuatro.equals("No")) {
                opcionRespuesta = radioButtonquestion4;

            }else if (preguntacuatro.equals("Si")) {
                opcionRespuesta = radioButtonquestion4;
            }

            // Verificar si se encontró la opción de respuesta y hacer clic en ella
            if (opcionRespuesta != null) {
                wait.until(ExpectedConditions.visibilityOf(radioButtonquestion4));
                JavascriptExecutor executor = (JavascriptExecutor) getDriver();
                executor.executeScript("arguments[0].click();",opcionRespuesta);
            } else {
                System.out.println("No se encontró la opción de respuesta especificada.");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void radioButtonquestion5 (String preguntacinco) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        try {
            WebElement opcionRespuesta = null;

            if (preguntacinco.equals("No")) {
                opcionRespuesta = radioButtonquestion5;

            }else if (preguntacinco.equals("Si")) {
                opcionRespuesta = radioButtonquestion5;
            }

            // Verificar si se encontró la opción de respuesta y hacer clic en ella
            if (opcionRespuesta != null) {
                wait.until(ExpectedConditions.visibilityOf(radioButtonquestion5));
                JavascriptExecutor executor = (JavascriptExecutor) getDriver();
                executor.executeScript("arguments[0].click();",opcionRespuesta);
            } else {
                System.out.println("No se encontró la opción de respuesta especificada.");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void radioButtonquestion6 (String pregunta6) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        try {
            WebElement opcionRespuesta = null;

            if (pregunta6.equals("No")) {
                opcionRespuesta = radioButtonquestion6;

            }else if (pregunta6.equals("Si")) {
                opcionRespuesta = radioButtonquestion6;
            }

            // Verificar si se encontró la opción de respuesta y hacer clic en ella
            if (opcionRespuesta != null) {
                wait.until(ExpectedConditions.visibilityOf(radioButtonquestion6));
                JavascriptExecutor executor = (JavascriptExecutor) getDriver();
                executor.executeScript("arguments[0].click();",opcionRespuesta);
            } else {
                System.out.println("No se encontró la opción de respuesta especificada.");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void radioButtonquestion7 (String preguntasiete) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        try {
            WebElement opcionRespuesta = null;

            if (preguntasiete.equals("No")) {
                opcionRespuesta = radioButtonquestion7;

            }else if (preguntasiete.equals("Si")) {
                opcionRespuesta = radioButtonquestion7;
            }

            // Verificar si se encontró la opción de respuesta y hacer clic en ella
            if (opcionRespuesta != null) {
                wait.until(ExpectedConditions.visibilityOf(radioButtonquestion7));
                JavascriptExecutor executor = (JavascriptExecutor) getDriver();
                executor.executeScript("arguments[0].click();",opcionRespuesta);
            } else {
                System.out.println("No se encontró la opción de respuesta especificada.");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void radioButtonquestion8 (String pregunta8) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        try {
            WebElement opcionRespuesta = null;

            if (pregunta8.equals("No")) {
                opcionRespuesta = radioButtonquestion8;

            }else if (pregunta8.equals("Si")) {
                opcionRespuesta = radioButtonquestion8;
            }

            // Verificar si se encontró la opción de respuesta y hacer clic en ella
            if (opcionRespuesta != null) {
                wait.until(ExpectedConditions.visibilityOf(radioButtonquestion8));
                JavascriptExecutor executor = (JavascriptExecutor) getDriver();
                executor.executeScript("arguments[0].click();",opcionRespuesta);
            } else {
                System.out.println("No se encontró la opción de respuesta especificada.");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void txtpeso(String peso){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        txtPeso = wait.until(ExpectedConditions.visibilityOf(txtPeso));
        txtPeso.sendKeys(peso);
        txtPeso.sendKeys(Keys.TAB);


    }

    public void txtaltura(String altura){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        //txtaltura = wait.until(ExpectedConditions.visibilityOf(txtaltura));
        txtaltura.sendKeys(altura);

    }

    public void radioButtonquestion9 (String pregunta9) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        try {
            WebElement opcionRespuesta = null;

            if (pregunta9.equals("No")) {
                opcionRespuesta = radioButtonquestion9;

            }else if (pregunta9.equals("Si")) {
                opcionRespuesta = radioButtonquestion9;
            }

            // Verificar si se encontró la opción de respuesta y hacer clic en ella
            if (opcionRespuesta != null) {
                wait.until(ExpectedConditions.visibilityOf(radioButtonquestion9));
                JavascriptExecutor executor = (JavascriptExecutor) getDriver();
                executor.executeScript("arguments[0].click();",opcionRespuesta);
            } else {
                System.out.println("No se encontró la opción de respuesta especificada.");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void radioButtonquestion10 (String pregunta10) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        try {
            WebElement opcionRespuesta = null;

            if (pregunta10.equals("No")) {
                opcionRespuesta = radioButtonquestion10;

            }else if (pregunta10.equals("Si")) {
                opcionRespuesta = radioButtonquestion10;
            }

            // Verificar si se encontró la opción de respuesta y hacer clic en ella
            if (opcionRespuesta != null) {
                wait.until(ExpectedConditions.visibilityOf(radioButtonquestion10));
                JavascriptExecutor executor = (JavascriptExecutor) getDriver();
                executor.executeScript("arguments[0].click();",opcionRespuesta);
            } else {
                System.out.println("No se encontró la opción de respuesta especificada.");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void radioButtonquestion11 (String pregunta11) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        try {
            WebElement opcionRespuesta = null;

            if (pregunta11.equals("No")) {
                opcionRespuesta = radioButtonquestion11;

            }else if (pregunta11.equals("Si")) {
                opcionRespuesta = radioButtonquestion11;
            }

            // Verificar si se encontró la opción de respuesta y hacer clic en ella
            if (opcionRespuesta != null) {
                wait.until(ExpectedConditions.visibilityOf(radioButtonquestion11));
                JavascriptExecutor executor = (JavascriptExecutor) getDriver();
                executor.executeScript("arguments[0].click();",opcionRespuesta);
            } else {
                System.out.println("No se encontró la opción de respuesta especificada.");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void radioButtonquestion12 (String pregunta12) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        try {
            WebElement opcionRespuesta = null;

            if (pregunta12.equals("No")) {
                opcionRespuesta = radioButtonquestion12;

            }else if (pregunta12.equals("Si")) {
                opcionRespuesta = radioButtonquestion12;
            }

            // Verificar si se encontró la opción de respuesta y hacer clic en ella
            if (opcionRespuesta != null) {
                wait.until(ExpectedConditions.visibilityOf(radioButtonquestion12));
                JavascriptExecutor executor = (JavascriptExecutor) getDriver();
                executor.executeScript("arguments[0].click();",opcionRespuesta);
            } else {
                System.out.println("No se encontró la opción de respuesta especificada.");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void radioButtonquestion13 (String pregunta13) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        try {
            WebElement opcionRespuesta = null;

            if (pregunta13.equals("No")) {
                opcionRespuesta = radioButtonquestion13;

            }else if (pregunta13.equals("Si")) {
                opcionRespuesta = radioButtonquestion13;
            }

            // Verificar si se encontró la opción de respuesta y hacer clic en ella
            if (opcionRespuesta != null) {
                wait.until(ExpectedConditions.visibilityOf(radioButtonquestion13));
                JavascriptExecutor executor = (JavascriptExecutor) getDriver();
                executor.executeScript("arguments[0].click();",opcionRespuesta);
            } else {
                System.out.println("No se encontró la opción de respuesta especificada.");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void radioButtonquestion14 (String pregunta14) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        try {
            WebElement opcionRespuesta = null;

            if (pregunta14.equals("No")) {
                opcionRespuesta = radioButtonquestion14;

            }else if (pregunta14.equals("Si")) {
                opcionRespuesta = radioButtonquestion14;
            }

            // Verificar si se encontró la opción de respuesta y hacer clic en ella
            if (opcionRespuesta != null) {
                wait.until(ExpectedConditions.visibilityOf(radioButtonquestion14));
                JavascriptExecutor executor = (JavascriptExecutor) getDriver();
                executor.executeScript("arguments[0].click();",opcionRespuesta);
            } else {
                System.out.println("No se encontró la opción de respuesta especificada.");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void radioButtonquestion15 (String pregunta15) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        try {
            WebElement opcionRespuesta = null;

            if (pregunta15.equals("No")) {
                opcionRespuesta = radioButtonquestion15;

            }else if (pregunta15.equals("Si")) {
                opcionRespuesta = radioButtonquestion15;
            }

            // Verificar si se encontró la opción de respuesta y hacer clic en ella
            if (opcionRespuesta != null) {
                wait.until(ExpectedConditions.visibilityOf(radioButtonquestion15));
                JavascriptExecutor executor = (JavascriptExecutor) getDriver();
                executor.executeScript("arguments[0].click();",opcionRespuesta);
            } else {
                System.out.println("No se encontró la opción de respuesta especificada.");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void radioButtonquestion16 (String pregunta16) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        try {
            WebElement opcionRespuesta = null;

            if (pregunta16.equals("No")) {
                opcionRespuesta = radioButtonquestion16;

            }else if (pregunta16.equals("Si")) {
                opcionRespuesta = radioButtonquestion16;
            }

            // Verificar si se encontró la opción de respuesta y hacer clic en ella
            if (opcionRespuesta != null) {
                wait.until(ExpectedConditions.visibilityOf(radioButtonquestion16));
                JavascriptExecutor executor = (JavascriptExecutor) getDriver();
                executor.executeScript("arguments[0].click();",opcionRespuesta);
            } else {
                System.out.println("No se encontró la opción de respuesta especificada.");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void radioButtonquestion17 (String pregunta17) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        try {
            WebElement opcionRespuesta = null;

            if (pregunta17.equals("No")) {
                opcionRespuesta = radioButtonquestion17;

            }else if (pregunta17.equals("Si")) {
                opcionRespuesta = radioButtonquestion17;
            }

            // Verificar si se encontró la opción de respuesta y hacer clic en ella
            if (opcionRespuesta != null) {
                wait.until(ExpectedConditions.visibilityOf(radioButtonquestion17));
                JavascriptExecutor executor = (JavascriptExecutor) getDriver();
                executor.executeScript("arguments[0].click();",opcionRespuesta);
            } else {
                System.out.println("No se encontró la opción de respuesta especificada.");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void radioButtonquestion18 (String pregunta18) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        try {
            WebElement opcionRespuesta = null;

            if (pregunta18.equals("No")) {
                opcionRespuesta = radioButtonquestion18;

            }else if (pregunta18.equals("Si")) {
                opcionRespuesta = radioButtonquestion18;
            }

            // Verificar si se encontró la opción de respuesta y hacer clic en ella
            if (opcionRespuesta != null) {
                wait.until(ExpectedConditions.visibilityOf(radioButtonquestion18));
                JavascriptExecutor executor = (JavascriptExecutor) getDriver();
                executor.executeScript("arguments[0].click();",opcionRespuesta);
            } else {
                System.out.println("No se encontró la opción de respuesta especificada.");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void radioButtonquestion19 (String pregunta19) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        try {
            WebElement opcionRespuesta = null;

            if (pregunta19.equals("No")) {
                opcionRespuesta = radioButtonquestion19;

            }else if (pregunta19.equals("Si")) {
                opcionRespuesta = radioButtonquestion19;
            }

            // Verificar si se encontró la opción de respuesta y hacer clic en ella
            if (opcionRespuesta != null) {
                wait.until(ExpectedConditions.visibilityOf(radioButtonquestion19));
                JavascriptExecutor executor = (JavascriptExecutor) getDriver();
                executor.executeScript("arguments[0].click();",opcionRespuesta);
            } else {
                System.out.println("No se encontró la opción de respuesta especificada.");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void radioButtonquestion20 (String pregunta20) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        try {
            WebElement opcionRespuesta = null;

            if (pregunta20.equals("No")) {
                opcionRespuesta = radioButtonquestion20;

            }else if (pregunta20.equals("Si")) {
                opcionRespuesta = radioButtonquestion20;
            }

            // Verificar si se encontró la opción de respuesta y hacer clic en ella
            if (opcionRespuesta != null) {
                wait.until(ExpectedConditions.visibilityOf(radioButtonquestion20));
                JavascriptExecutor executor = (JavascriptExecutor) getDriver();
                executor.executeScript("arguments[0].click();",opcionRespuesta);
            } else {
                System.out.println("No se encontró la opción de respuesta especificada.");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void radioButtonquestion21 (String pregunta21) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        try {
            WebElement opcionRespuesta = null;

            if (pregunta21.equals("No")) {
                opcionRespuesta = radioButtonquestion21;

            }else if (pregunta21.equals("Si")) {
                opcionRespuesta = radioButtonquestion21;
            }

            // Verificar si se encontró la opción de respuesta y hacer clic en ella
            if (opcionRespuesta != null) {
                wait.until(ExpectedConditions.visibilityOf(radioButtonquestion21));
                JavascriptExecutor executor = (JavascriptExecutor) getDriver();
                executor.executeScript("arguments[0].click();",opcionRespuesta);
            } else {
                System.out.println("No se encontró la opción de respuesta especificada.");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void radioButtonquestion22 (String pregunta22) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        try {
            WebElement opcionRespuesta = null;

            if (pregunta22.equals("No")) {
                opcionRespuesta = radioButtonquestion22;

            }else if (pregunta22.equals("Si")) {
                opcionRespuesta = radioButtonquestion22;
            }

            // Verificar si se encontró la opción de respuesta y hacer clic en ella
            if (opcionRespuesta != null) {
                wait.until(ExpectedConditions.visibilityOf(radioButtonquestion22));
                JavascriptExecutor executor = (JavascriptExecutor) getDriver();
                executor.executeScript("arguments[0].click();",opcionRespuesta);
            } else {
                System.out.println("No se encontró la opción de respuesta especificada.");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void radioButtonquestion23 (String pregunta23) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        try {
            WebElement opcionRespuesta = null;

            if (pregunta23.equals("No")) {
                opcionRespuesta = radioButtonquestion23;

            }else if (pregunta23.equals("Si")) {
                opcionRespuesta = radioButtonquestion23;
            }

            // Verificar si se encontró la opción de respuesta y hacer clic en ella
            if (opcionRespuesta != null) {
                wait.until(ExpectedConditions.visibilityOf(radioButtonquestion23));
                JavascriptExecutor executor = (JavascriptExecutor) getDriver();
                executor.executeScript("arguments[0].click();",opcionRespuesta);
            } else {
                System.out.println("No se encontró la opción de respuesta especificada.");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void radioButtonquestion24 (String pregunta24) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        try {
            WebElement opcionRespuesta = null;

            if (pregunta24.equals("No")) {
                opcionRespuesta = radioButtonquestion24;

            }else if (pregunta24.equals("Si")) {
                opcionRespuesta = radioButtonquestion24;
            }

            // Verificar si se encontró la opción de respuesta y hacer clic en ella
            if (opcionRespuesta != null) {
                wait.until(ExpectedConditions.visibilityOf(radioButtonquestion24));
                JavascriptExecutor executor = (JavascriptExecutor) getDriver();
                executor.executeScript("arguments[0].click();",opcionRespuesta);
            } else {
                System.out.println("No se encontró la opción de respuesta especificada.");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void submitButton(){
        submitButton.click();

    }

    public void btnSi() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(btnSi));
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", btnSi);
        Thread.sleep(200000); // Pausa de 3 segundos (ajusta el tiempo según sea necesario)
    }

    public void btnContinuarDa() {
        try {

            WebDriverWait wait = new WebDriverWait(getDriver(), 20);

            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#continuarDeclaration.btn.btn-primary")));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            JavascriptExecutor executor = (JavascriptExecutor) getDriver();
            executor.executeScript("arguments[0].scrollIntoView(true);", element);
            executor.executeScript("arguments[0].click();", element);

            Thread.sleep(10); // Pausa de 3 segundos (ajusta el tiempo según sea necesario)
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
    public boolean isDisplayedEmision() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 200);

        try {
            // Esperar a que el elemento de confirmación esté visible
            WebElement txtMensaje = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@align='center' and text()='COTIZACIÓN']")));

            // Desplazar la página hasta el elemento usando JavaScript
            ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);",txtMensaje);

            return txtMensaje.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}



