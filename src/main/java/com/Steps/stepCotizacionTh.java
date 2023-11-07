package com.Steps;

import com.Pages.cotizacionThPage;
import net.thucydides.core.annotations.Steps;

public class stepCotizacionTh {
    @Steps
    cotizacionThPage cth;
    public void codAgentInput(String codAgent) throws InterruptedException {
        cth.codAgenteInput(codAgent);
    }
    public void selectProducto(String producto){
        cth.tranquilidadHijosOption(producto);
    }
    public void numeroDocumentoInput(String numerodocumentaciontom)
    {
        cth.numeroDocumentoInput(numerodocumentaciontom);
    }
    public void tipoDocumentoAseOption(String tipodocumentoase)
    {
        cth.tipoDocumentoAseOption(tipodocumentoase);
    }
    public void numeroDocumentoAseInput(String numerodocumentacionase)
    {
        cth.numeroDocumentoAseInput(numerodocumentacionase);
    }

    public void codCiudadTomadorInput(String ciudad)
    {
        cth.codCiudadTomadorInput(ciudad);
    }
    public void autorizaDatosCheckTomador() {
        cth.autorizaDatosCheckTomador();
    }
    public void autorizaDatosCheckAsegurado(){
        cth.autorizaDatosCheckAsegurado();
    }
    public void amaparoBasicoInput(String amparobasico)
    {
        cth.amparoBasicoInput(amparobasico);
    }
    public void btnLiquidar() throws InterruptedException {
        cth.btnLiquidar();
    }public void btnCrearCotizacion() throws InterruptedException {
        cth.btnCrearCotizacion();
    }
}
