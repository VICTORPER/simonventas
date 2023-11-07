package com.Models;

public class datosConsultaCotizacion {

    String compania;
    String fechadesde;
    String seccion;
    String fechahasta;
    String numerodecotizacion;
    String producto;


    public datosConsultaCotizacion(String fechadesde, String compania, String seccion, String producto, String fechahasta, String numerodecotizacion) {
        this.compania = compania;
        this.fechadesde = fechadesde;
        this.seccion = seccion;
        this.fechahasta = fechahasta;
        this.numerodecotizacion = numerodecotizacion;
        this.producto= producto;
    }


    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getFechadesde() {
        return fechadesde;
    }

    public void setFechadesde(String fechadesde) {
        this.fechadesde = fechadesde;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getFechahasta() {
        return fechahasta;
    }

    public void setFechahasta(String fechahasta) {
        this.fechahasta = fechahasta;
    }

    public String getNumerodecotizacion() {
        return numerodecotizacion;
    }

    public void setNumerodecotizacion(String numerodecotizacion) {
        this.numerodecotizacion = numerodecotizacion;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
}
