package com.Pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class formulariodeclaracionAsegurabilidadPage extends PageObject {
    @FindBy(css = "input.conductor[value='Si']")
    WebElement radioButtonquestion1;

    public void radioButtonquestion1 () {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        try {
            wait.until(ExpectedConditions.visibilityOf(radioButtonquestion1));
            JavascriptExecutor executor = (JavascriptExecutor) getDriver();
            executor.executeScript("arguments[0].click();", radioButtonquestion1);

                if (!isRadioButtonSelected()) {
                    wait.until(ExpectedConditions.visibilityOf(radioButtonquestion1));
                    executor.executeScript("arguments[0].click();", radioButtonquestion1);
                }
            // Esperar a que el elemento de confirmación esté visible


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public boolean isRadioButtonSelected() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(radioButtonquestion1));
        return radioButtonquestion1.isSelected();
    }
}
