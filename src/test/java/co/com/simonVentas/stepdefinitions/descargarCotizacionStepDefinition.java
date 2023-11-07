package co.com.simonVentas.stepdefinitions;

import com.Steps.stepConsultaCotizacion;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class descargarCotizacionStepDefinition {

    @Steps
    stepConsultaCotizacion cc;
    @Given("que el sistema trajo la consulta")
    public void queElSistemaTrajoLaConsulta() {
        Assert.assertTrue(cc.messageQuery());
        }

    @When("Doy click en el icono de impresora")
    public void doyClickEnElIconoDeImpresora() throws InterruptedException {
       cc.btnImprimir();
     }

    @Then("se descargar el archivo de resumen de cotizacion")
    public void seDescargarElArchivoDeResumenDeCotizacion() {
        // Write code here that turns the phrase above into concrete actions
    }

}
