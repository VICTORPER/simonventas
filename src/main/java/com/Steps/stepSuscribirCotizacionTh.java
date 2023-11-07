package com.Steps;

import com.Pages.suscribirCotizacionThPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class stepSuscribirCotizacionTh {

    @Steps
    suscribirCotizacionThPage sus;

    @Step
    public void btnSuscribir() throws InterruptedException {
        sus.btnSuscribir();
    }
}
