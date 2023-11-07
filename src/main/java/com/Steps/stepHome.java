package com.Steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import com.Pages.homePage;

public class stepHome {

    homePage home;

    @Step
    public boolean isDisplayed(){
        return home.isDisplayed();
    }

    @Step
    public void btnConsultarCotizador (){
        home.btnConsultaCotizaciones();
    }
    @Step
    public void btnConsultarCotizadorxRango (){
        home.btnConsultaCotizacionxrango();
    }
    @Step
    public void btnCotizadoresVida (){
        home.btncotizadoresVida();
    }
    @Step
    public void btnportafolioTranquilidadEnVida (){
        home.btnportafolioTranquilidadEnVida();
    }
    @Step
    public void btnSiguiente (){
        home.btnSiguiente();
    }

}
