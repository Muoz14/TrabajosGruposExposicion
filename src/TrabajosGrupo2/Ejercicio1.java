package TrabajosGrupo2;

import ClasesCasos.Casos;
import java.util.Scanner;

public class Ejercicio1 {

    public static void ejercicio1(){

        /// Programa que le muestra al usuario el dia de la semana correspondiente al numero ingresado

        Scanner entrada = new Scanner(System.in);
        Casos c = new Casos();
        int numero;

        System.out.println("Ingrese un numero entre 1 y 7: ");
        numero = entrada.nextInt();

        System.out.println(c.diasSemana(numero));

    }

    public static void main(String[] args){

        ejercicio1();

    }

}
