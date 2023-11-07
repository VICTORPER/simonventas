package com.Steps;

import com.Pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class stepLogin {
    LoginPage login;
    @Step
    public void openPage() {
        login.open();
    }

    @Step
    public void btnLogin() {
        login.btnLogin();
    }


}
