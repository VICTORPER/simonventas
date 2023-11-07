package co.com.simonVentas.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/descargarCotizacion.feature",
        glue= "co/com/simonVentas/stepdefinitions", snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class runnerDescargarCotizacion {


}
