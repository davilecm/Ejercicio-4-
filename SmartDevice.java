package com.Smart;

import com.Smart.Herencia.SmartWatch;

public class SmartDevice {

    // 1. Atributos

    protected String fabricante;
    protected String modelo;
    protected double pantalla;
    protected double resolucion;
    protected int bateria;
    protected double peso;

    // 2. constructor

    public SmartDevice(){

    }

    public SmartDevice(String fabricante, String modelo, double pantalla, double resolucion, int bateria, double peso) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.pantalla = pantalla;
        this.resolucion = resolucion;
        this.bateria = bateria;
        this.peso = peso;
    }

    public SmartDevice(String fabricante, String modelo, double pantalla, double resolucion) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.pantalla = pantalla;
        this.resolucion = resolucion;
    }

    // 3. método


}
