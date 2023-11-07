package co.com.simonVentas.stepdefinitions;

import com.Steps.stepHome;
import com.Steps.stepLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class loginStepDefinition {

     @Steps
     stepLogin login;
     @Steps
     stepHome home;

    @Given("que ingreso a la pagina http:\\/\\/{double}.{int}.{int}:{int}\\/SimonQuotation\\/login")
    public void queIngresoALaPaginaHttpSimonQuotationLogin(Double double1, Integer int1, Integer int2, Integer int3) {
        login.openPage();
    }

    @When("doy click en el boton login")
    public void doyClickEnElBotonLogin() {
        login.btnLogin();
    }

    @Then("valido el ingreso exitoso")
    public void validoElIngresoExitoso() {
        Assert.assertTrue(home.isDisplayed());

    }
}
