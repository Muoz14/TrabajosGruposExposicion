package TrabajosGrupo2;

import ClasesCasos.Casos;
import ClasesCondiciones.Condiciones;

import java.util.Scanner;

public class Ejercicio3 {

    public static void ejercicio3(){

        /// Programa que le pide al usuario ingresar un caracter y evalua si este es una vocal o no.

        Casos c = new Casos();
        Scanner entrada = new Scanner(System.in);

        String caracter = "";

        System.out.println("Ingrese un caracter a evaluar: ");
        caracter = entrada.next();

        System.out.println(c.Vocal(caracter));


    }

    public static void main(String[] args){

        ejercicio3();

    }

}
