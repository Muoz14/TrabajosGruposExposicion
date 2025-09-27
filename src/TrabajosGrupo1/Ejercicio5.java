package TrabajosGrupo1;

import ClasesCondiciones.Condiciones;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main (String[] args){

        /// Programa que pide la edad al usuario y que devuelve si es menor de edad, mayor, mayoria o tercera edad.

        Condiciones c = new Condiciones();
        Scanner entrada = new Scanner(System.in);

        int edad;

        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();

        System.out.println(c.edades(edad));

    }


}