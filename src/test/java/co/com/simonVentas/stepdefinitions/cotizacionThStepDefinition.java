package co.com.simonVentas.stepdefinitions;

import com.Pages.homePage;
import com.Steps.stepCotizacionTh;
import com.Steps.stepFormularioDeclaracionAsegurabilidad;
import com.Steps.stepHome;
import com.Steps.stepSuscribirCotizacionTh;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class cotizacionThStepDefinition {

    @Steps
    stepHome home;
    @Steps
    stepCotizacionTh cth;
    @Steps
    stepSuscribirCotizacionTh sus;

    @Steps
    stepFormularioDeclaracionAsegurabilidad da;

    @When("Doy click en el boton Cotizadores vida")
    public void doyClickEnElBotonCotizadoresVida() {
    home.btnCotizadoresVida();
    }

    @When("Doy click en el boton Portafolio Tranquilidad en vida")
    public void doyClickEnElBotonPortafolioTranquilidadEnVida() {
     home.btnportafolioTranquilidadEnVida();
    }

    @When("Doy click en el boton siguiente")
    public void doyClickEnElBotonSiguiente() {
     home.btnSiguiente();
    }

    @When("Ingrese la clave del asesor {string}")
    public void ingreseLaClaveDelAsesor(String codAgent) throws InterruptedException {
      cth.codAgentInput(codAgent);
    }

    @When("Ingreso el producto {string}")
    public void ingresoElProducto(String producto) {
      cth.selectProducto(producto);
    }

    @When("Ingreso el numero de documento del tomador {string}")
    public void ingresoElNumeroDeDocumentoDelTomador(String numerodocumentaciontom) {
      cth.numeroDocumentoInput(numerodocumentaciontom);
    }

    @When("Lleno los siguientes campos del asegurado:")
    public void llenoLosSiguientesCamposDelAsegurado(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> row : data) {
            String tipodocumentoase = row.get("tipodocumento");
            String numerodocumentoase = row.get("numerodocumentoase");
            String ciudad = row.get("ciudad");
            cth.tipoDocumentoAseOption(tipodocumentoase);
            cth.numeroDocumentoAseInput(numerodocumentoase);
            cth.codCiudadTomadorInput(ciudad);
        }
    }
    @When("doy click en aceptar Autoriza uso de datos? del tomador")
    public void doyClickEnAceptarAutorizaUsoDeDatosDelTomador() {
        cth.autorizaDatosCheckTomador();
    }

    @When("Doy click en el aceptar de Autoriza uso de datos? del asegurado")
    public void doyClickEnElAceptarDeAutorizaUsoDeDatosDelAsegurado() {
        cth.autorizaDatosCheckAsegurado();
    }

    @When("Ingresar en la seccion Negociacion el valor asegurado {string}")
    public void ingresarEnLaSeccionNegociacionElValorAsegurado(String amparobasico) {
         cth.amaparoBasicoInput(amparobasico);
    }

    @When("Doy click en el boton liquidar")
    public void doyClickEnElBotonLiquidar() throws InterruptedException {
        cth.btnLiquidar();
    }

    @When("Doy click en el boton crear cotizacion")
    public void doyClickEnElBotonCrearCotizacion() throws InterruptedException {
        cth.btnCrearCotizacion();
    }

    @When("Doy click en el boton suscribir de la pantalla de suscripcion")
    public void doyClickEnElBotonSuscribirDeLaPantallaDeSuscripcion() throws InterruptedException {
       sus.btnSuscribir();
    }

    @Then("crea la cotizacion exitosamente")
    public void creaLaCotizacionExitosamente() {
        Assert.assertTrue(da.tituloDeclaracionAsegurabilidad());
    }

}
