package TrabajosGrupo1;

import ClasesCondiciones.Condiciones;

import java.util.Scanner;

public class Ejercicio6 {

    public static void ejercicio6 (){

        /// Programa que pide 2 numeros y le da la opcion al usuario de elejir que operacion aritmetica desea realizar

        Scanner entrada = new Scanner(System.in);
        Condiciones c = new Condiciones();

        int n1, n2;
        String operacion;

        System.out.println("Ingrese numero 1: ");
        n1 = entrada.nextInt();

        System.out.println("Ingrese numero 2: ");
        n2 = entrada.nextInt();

        System.out.println("OPERACIONES: ");
        System.out.println("(+) Suma");
        System.out.println("(-) Resta");
        System.out.println("(*) Multipliacion");
        System.out.println("(/) Division");

        System.out.println("Ingrese la operacion que desea realizar: ");
        operacion = entrada.next();

        System.out.println("El resultado de la operacion es = " + c.operaciones(n1, n2, operacion));

    }

    public static void main(String[] args){

        ejercicio6();

    }

}
