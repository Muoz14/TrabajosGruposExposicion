package TrabajosGrupo2;

import ClasesCasos.Casos;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        Casos c = new Casos();

        String color = "";

        System.out.println("Ingrese un color: ");
        color = entrada.next();

        System.out.println(c.colorePrimarios(color));


    }

}
