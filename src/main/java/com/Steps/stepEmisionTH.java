package com.Steps;

import com.Pages.emisionthPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class stepEmisionTH {

    @Steps
    emisionthPage eth;

    @Step
    public boolean txtEmision(){
        return eth.isDisplayedEmision();
    }

    @Step
    public void autorizaCheck(){
        eth.autorizaDatosCheck();
    }

    @Step
    public void addButtonBeneficiario(){
        eth.addButtonBeneficiario();
    }
    @Step
    public void selectTipoDoc(String tipodocumento) {
        eth.selectTipoDoc(tipodocumento);
    }

    @Step
    public void txtNumeroDocumento(String numerodocumento){
        eth.txtNumeroDocumento(numerodocumento);
    }

    @Step
    public void txtNombreBeneficiario(String nombres){
        eth.txtNombreBeneficiario(nombres);
    }

    @Step
    public void txtApellidosBen(String apellidos){
        eth.txtApellidosBeneficiario(apellidos);
    }

    @Step
    public void selectSexoBen(String sexo) {
        eth.selectSexoBen(sexo);
    }
    @Step
    public void selectParentescoBen(String parentesco) {
        eth.selectParentescoBen(parentesco);
    }

    @Step
    public void txtPorcentaje(String porcentaje) {
        eth.txtParticipacionBen(porcentaje);
    }

    @Step
    public void btnGenerarPoliza() throws InterruptedException {
        eth.btnGenerarPoliza();
    }
    @Step
    public boolean txtMessageEmisionOk(){
        return eth.isDisplayedEmisionOK();
    }
}
