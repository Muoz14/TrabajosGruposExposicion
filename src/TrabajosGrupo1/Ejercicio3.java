package TrabajosGrupo1;
import ClasesCondiciones.Condiciones;
import java.util.Scanner;


public class Ejercicio3 {

    public static void ejercicio3(){

        /// Programa que devuelve cual de los dos numeros ingresados es el mayor y cual es el menor.

        Condiciones c =  new Condiciones();
        Scanner entrada = new Scanner(System.in);

        int n1, n2;

        System.out.println("Ingrese primer numero: ");
        n1 = entrada.nextInt();

        System.out.println("Ingrese segundo numero: ");
        n2 = entrada.nextInt();

        System.out.println(c.mayorMenor(n1, n2));


    }

    public static void main(String[] args){

        ejercicio3();

    }

}