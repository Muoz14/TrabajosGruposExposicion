package TrabajosGrupo2;

import ClasesCasos.Casos;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args){

        /// Programa que le muestra el mes del año al usuario dependiendo del numero entre 1 y 12 ingresado

        Scanner entrada = new Scanner(System.in);
        Casos c = new Casos();
        int numero;

        System.out.println("Ingrese un numero entre 1 y 12: ");
        numero = entrada.nextInt();

        System.out.println(c.Meses(numero));

    }

}
