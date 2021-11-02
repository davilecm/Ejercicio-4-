package com.Smart;

import com.Smart.Herencia.SmartPhone;
import com.Smart.Herencia.SmartWatch;

public class Main {

    /*
Ejercicio Sesión 4

Ejercicio 1

En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.

Agregaréis atributos tal cual tendrían esos objetos en la realidad.

Crear constructor vacío y con todos los parámetros para cada clase.

Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.

     */
    public static void main(String[] args) {

        // Clase crear objetos a partir de constructor


        SmartDevice Televisión = new SmartDevice("Samsung","QWASD",27,1080);
        System.out.println(Televisión.fabricante);

        SmartWatch Reloj = new SmartWatch();
        Reloj.fabricante = "Huawei";
        Reloj.modelo = "Huawei Watch GT";
        System.out.println(Reloj.modelo);

        SmartPhone móvil = new SmartPhone();

        móvil.fabricante = "Xiaomi";
        móvil.peso = 23.40;
        System.out.println(móvil.peso);

    }
}
