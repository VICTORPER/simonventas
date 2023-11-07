package co.com.simonVentas.stepdefinitions;

import com.Steps.stepEmisionTH;
import com.Steps.stepFormularioDeclaracionAsegurabilidad;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;
import java.util.Map;

public class emisionThStepDefinition {
    @Steps
    stepEmisionTH eth;

    @Steps
    stepFormularioDeclaracionAsegurabilidad da;

    @Given("Me encuentro en la pantalla de emision")
    public void meEncuentroEnLaPantallaDeEmision() {
        eth.txtEmision();
    }

    @When("Doy clck en el check Autorizo datos")
    public void doyClckEnElCheckAutorizoDatos() {
        eth.autorizaCheck();
    }

    @When("Doy click sobre el boton Agregar beneficiario")
    public void doyClickSobreElBotonAgregarBeneficiario() {
     eth.addButtonBeneficiario();
    }

    @When("diligencio los campos siguientes")
    public void diligencioLosCamposSiguientes(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
            eth.selectTipoDoc(data.get(0).get("tipodocumento"));
            eth.txtNumeroDocumento(data.get(0).get("numerodocumento"));
            eth.txtNombreBeneficiario(data.get(0).get("nombres"));
            eth.txtApellidosBen(data.get(0).get("apellidos"));
            eth.selectSexoBen(data.get(0).get("sexo"));
            eth.selectParentescoBen(data.get(0).get("parentesco"));
            eth.txtPorcentaje(data.get(0).get("porcentaje"));

        }

    @When("doy click en el boton Generar Poliza")
    public void doyClickEnElBotonGenerarPoliza() throws InterruptedException {
        eth.btnGenerarPoliza();

    }

    @Then("genera la poliza exitosamente")
    public void generaLaPolizaExitosamente() {
        eth.txtMessageEmisionOk();
    }

}
