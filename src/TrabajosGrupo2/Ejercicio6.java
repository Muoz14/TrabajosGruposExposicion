package TrabajosGrupo2;

import ClasesCasos.Casos;

import java.util.Scanner;

public class Ejercicio6 {

    public static void ejercicio6(){

        Scanner entrada = new Scanner(System.in);
        Casos c = new Casos();

        int opcion = 0;

        System.out.println("MENU DE OPCIONES");

            System.out.println(" 1. Consultar dinero.");
            System.out.println(" 2. Depositar dinero.");
            System.out.println(" 3. Retirar dinero.");
            System.out.println(" 4. Salir.");

        System.out.println("Ingrese una opcion: ");
        opcion = entrada.nextInt();

        c.Dinero(opcion);

    }

    public static void main(String[] args){

        ejercicio6();

    }

}
