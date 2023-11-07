package com.Steps;

import com.Pages.daPage;
import com.Pages.formulariodeclaracionAsegurabilidadPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class stepFormularioDeclaracionAsegurabilidad {
    @Steps
    //formulariodeclaracionAsegurabilidadPage da;
    daPage da;
    @Step
    public void radiobuttonpregunta1(String preguntauno) {
        da.radioButtonquestion1(preguntauno);
    }

    @Step
    public void radiobuttonpregunta2(String preguntados) {
        da.radioButtonquestion2(preguntados);
    }
    @Step
    public void radiobuttonpregunta3(String preguntatres) {
        da.radioButtonquestion3(preguntatres);
    }

    @Step
    public void radiobuttonpregunta4(String preguntacuatro) {
        da.radioButtonquestion4(preguntacuatro);
    }

    @Step
    public void radiobuttonpregunta5(String preguntacinco) {
        da.radioButtonquestion5(preguntacinco);
    }

    @Step
    public void radiobuttonpregunta6(String preguntaseis) {
        da.radioButtonquestion6(preguntaseis);
    }

    @Step
    public void radiobuttonpregunta7(String preguntasiete) {
        da.radioButtonquestion7(preguntasiete);
    }

    @Step
    public void radiobuttonpregunta8(String preguntaocho) {
        da.radioButtonquestion8(preguntaocho);
    }

    @Step
    public void txtPeso(String peso) {
        da.txtpeso(peso);
    }

    @Step
    public void txtaltura(String altura) {
        da.txtaltura(altura);
    }

    @Step
    public void radiobuttonpregunta9(String preguntanueve) {
        da.radioButtonquestion9(preguntanueve);
    }

    @Step
    public void radiobuttonpregunta10(String preguntadiez) {
        da.radioButtonquestion10(preguntadiez);
    }

    @Step
    public void radiobuttonpregunta11(String preguntaonce) {
        da.radioButtonquestion11(preguntaonce);
    }

    @Step
    public void radiobuttonpregunta12(String preguntadoce) {
        da.radioButtonquestion12(preguntadoce);
    }

    @Step
    public void radiobuttonpregunta13(String preguntatrece) {
        da.radioButtonquestion13(preguntatrece);
    }

    @Step
    public void radiobuttonpregunta14(String preguntacatorce) {
        da.radioButtonquestion14(preguntacatorce);
    }

    @Step
    public void radiobuttonpregunta15(String preguntaquince) {
        da.radioButtonquestion15(preguntaquince);
    }

    @Step
    public void radiobuttonpregunta16(String pregunta16) {
        da.radioButtonquestion16(pregunta16);
    }

    @Step
    public void radiobuttonpregunta17(String pregunta17) {
        da.radioButtonquestion17(pregunta17);
    }

    @Step
    public void radiobuttonpregunta18(String pregunta18) {
        da.radioButtonquestion18(pregunta18);
    }

    @Step
    public void radiobuttonpregunta19(String pregunta19) {
        da.radioButtonquestion19(pregunta19);
    }

    @Step
    public void radiobuttonpregunta20(String pregunta20) {
        da.radioButtonquestion20(pregunta20);
    }
    @Step
    public void radiobuttonpregunta21(String pregunta21) {
        da.radioButtonquestion21(pregunta21);
    }

    @Step
    public void radiobuttonpregunta22(String pregunta22) {
        da.radioButtonquestion22(pregunta22);
    }

    @Step
    public void radiobuttonpregunta23(String pregunta23) {
        da.radioButtonquestion23(pregunta23);
    }

    @Step
    public void radiobuttonpregunta24(String pregunta24) {
        da.radioButtonquestion24(pregunta24);
    }

    @Step
    public void submitButton(){
        da.submitButton();
    }
    @Step
    public void btnSi() throws InterruptedException {
        da.btnSi();
    }

    @Step
    public void btnContinuarDa(){
        da.btnContinuarDa();
    }

    @Step
    public boolean messageEmision(){
        return da.isDisplayedEmision();
    }

    @Step
    public boolean tituloDeclaracionAsegurabilidad(){
        return da.isDisplayedDA();
    }
}



