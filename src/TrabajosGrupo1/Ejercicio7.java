package TrabajosGrupo1;

import ClasesCondiciones.Condiciones;
import java.util.Scanner;

public class Ejercicio7 {

    public static void ejercicio7(){

        /// Programa que le permite al usuario ingresar un numero entre 1 y 7, si el numero esta en el rango
        /// se mostrara el dia correspondiente de la semana y sino mostrara un mensaje de error

        Scanner entrada = new Scanner(System.in);
        Condiciones c = new Condiciones();

        int numero;

        System.out.println("Ingrese un numero entre 1 y 7: ");
        numero = entrada.nextInt();

        System.out.println(c.diaSemana(numero));

    }

    public static void main(String[] args){

        ejercicio7();

    }

}