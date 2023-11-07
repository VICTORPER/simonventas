package co.com.simonVentas.stepdefinitions;

import com.Steps.stepConsultaCotizacion;
import com.Steps.stepHome;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class consultarCotizacionStepDefnition {

    @Steps
    stepHome home;

    @Steps
    stepConsultaCotizacion cc;

    @When("Doy click en el boton Consultar cotizacion")
    public void doyClickEnElBotonConsultarCotizacion() {
       home.btnConsultarCotizador();
    }

    @When("Doy click en el boton Consultar cotizacion x rango de fechas")
    public void doyClickEnElBotonConsultarCotizacionXRangoDeFechas() {
        home.btnConsultarCotizadorxRango();
    }

    @When("Lleno el formulario")
    public void llenoElFormulario(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        cc.selectCompania(data.get(0).get("compania"));
        cc.selectseccion(data.get(0).get("seccion"));
        String producto = data.get(0).get("producto");
        if (producto != null && !producto.equals("null") && !producto.isEmpty()) {
            cc.selectproducto(producto);
        }
        cc.txtNumerodeCotizacion(data.get(0).get("numerodecotizacion"));
        cc.txtFechainicio(data.get(0).get("fechadesde"));
        //cc.txtFechahasta(data.get(0).get("fechahasta"));
    }

    @When("Hago click en el boton Consultar")
    public void hagoClickEnElBotonConsultar() {
        cc.btnConsultar();
    }

    @When("Doy click en el numero de cotizacion")
    public void doyClickEnElNumeroDeCotizacion() {
        cc.clickenlace();
    }

    @Then("trae la informacion de la cotizacion")
    public void traeLaInformacionDeLaCotizacion() {
        Assert.assertTrue(cc.txtConfirmacion());
    }

}
