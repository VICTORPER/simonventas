package com.Steps;

import com.Pages.consultaCotizacionPage;
import net.thucydides.core.annotations.Step;

public class stepConsultaCotizacion {

    consultaCotizacionPage cc;


        @Step
        public void selectCompania(String compania)
        {
            cc.selectcompania(compania);

        }

    @Step
    public void selectseccion(String seccion)
    {
        cc.selectseccion(seccion);
    }
    public void selectproducto(String producto)
    {
        cc.selectproducto(producto);
    }

    @Step
    public void txtFechainicio(String fechadesde){
        cc.txtFechainicio(fechadesde);
    }

    @Step
    public void txtFechahasta(String fechahasta){
        cc.txtFechahasta(fechahasta);
    }


    @Step
    public void btnConsultar(){
       cc.btnConsultar();
    }
    @Step
    public void txtNumerodeCotizacion(String numerodecotizacion){
        cc.txtNumerodecotizacion(numerodecotizacion);
    }
    @Step
    public void clickenlace()
    {
        cc.clickencotizacion();
    }
    @Step
    public boolean txtConfirmacion(){
            return cc.txtConfirmacion();
    }
    @Step
    public boolean messageQuery(){
        return cc.isDisplayedQuery();
    }
   @Step
    public void btnImprimir() throws InterruptedException {
            cc.btnImprimir();
   }

   @Step
   public void btnEmitir()
     {
       cc.btnEmitir();
     }
}
