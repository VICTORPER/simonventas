package co.com.simonVentas.stepdefinitions;
import com.Pages.consultaCotizacionPage;
import com.Steps.stepFormularioDeclaracionAsegurabilidad;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class formulariodaStepDefinition {

    @Steps
    consultaCotizacionPage cc;

    @Steps
    stepFormularioDeclaracionAsegurabilidad da;
    @When("Doy click en el boton emitir")
    public void doyClickEnElBotonEmitir() {
       cc.btnEmitir();
       //da.radiobuttonpregunta1();
        System.out.println("aca ingreso primero");
    }
    @When("Diligencio  DECLARACION DE ASEGURABILIDAD")
    public void diligencioDECLARACIONDEASEGURABILIDAD(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> row : data) {
            String preguntauno = row.get("preguntauno");
            String preguntados = row.get("preguntados");
            String preguntatres = row.get("preguntatres");
            String preguntacuatro = row.get("preguntacuatro");
            String preguntacinco = row.get("preguntacinco");

            // Llamar al método correspondiente en la clase Page y pasar el valor de pregunta1
            da.radiobuttonpregunta1(preguntauno);
            da.radiobuttonpregunta2(preguntados);
            da.radiobuttonpregunta3(preguntatres);
            da.radiobuttonpregunta4(preguntacuatro);
            da.radiobuttonpregunta5(preguntacinco);
        }
    }

    @When("Diligencio  DECLARACION DE ASEGURABILIDAD Medica")
    public void diligencioDECLARACIONDEASEGURABILIDADMedica(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> row : data) {
            String preguntaseis = row.get("preguntaseis");
            String preguntasiete = row.get("preguntasiete");
            String preguntaocho = row.get("preguntaocho");
            String peso = row.get("peso");
            String altura = row.get("altura");
            String preguntanueve = row.get("preguntanueve");
            String preguntadiez = row.get("preguntadiez");

            da.radiobuttonpregunta6(preguntaseis);
            da.radiobuttonpregunta7(preguntasiete);
            da.radiobuttonpregunta8(preguntaocho);
            da.txtPeso(peso);
            da.txtaltura(altura);
            da.radiobuttonpregunta9(preguntanueve);
            da.radiobuttonpregunta10(preguntadiez);

        }

    }
    @When("doy click en el boton continuar")
    public void doyClickEnElBotonContinuar() {
        da.submitButton();
    }

    @When("doy click en el boton Si del pop up de confirmacion")
    public void doyClickEnElBotonSiDelPopUpDeConfirmacion() throws InterruptedException {
       da.btnSi();
    }

    @When("Hago click en el boton aceptar del pop up de numero de declaracion de asegurabilidad")
    public void hagoClickEnElBotonAceptarDelPopUpDeNumeroDeDeclaracionDeAsegurabilidad() {
        da.btnContinuarDa();
    }

    @Then("redirecciona a la pantalla de confirmacion de cotizacion")
    public void redireccionaALaPantallaDeConfirmacionDeCotizacion() {

        //Assert.assertTrue(da.messageEmision());
    }
}
