package com.Models;

public class datosBeneficiarios {

    String tipodocumento;
    String numerodocumento;
    String nombres;
    String apellidos;
    String sexo;
    String parentesco;
    String porcentaje;


    public datosBeneficiarios(String tipodocumento, String numerodocumento, String nombres, String apellidos, String sexo, String parentesco, String porcentaje) {
        this.tipodocumento = tipodocumento;
        this.numerodocumento = numerodocumento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.parentesco= parentesco;
        this.porcentaje=porcentaje;
    }

    public String getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(String tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public String getNumerodocumento() {
        return numerodocumento;
    }

    public void setNumerodocumento(String numerodocumento) {
        this.numerodocumento = numerodocumento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }
}
