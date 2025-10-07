package TrabajosGrupo1;
import ClasesCondiciones.Condiciones;
import java.util.Scanner;

public class Ejercicio2 {

    public static void ejercicio2(){

        /// Programa que calcula el total a pagar y aniade 5% de descuento a un producto cuyo costo sea > 100

        Condiciones c = new Condiciones();
        Scanner entrada = new Scanner(System.in);

        String nombre;
        float pProducto;

        System.out.println("Ingrese el nombre del producto: ");
        nombre = entrada.next();

        System.out.println("Ingrese el precio del producto: ");
        pProducto = entrada.nextFloat();

        System.out.println("----- FACTURA -----");

        c.totalPagar(pProducto);

    }

    public static void main(String[] args){

        ejercicio2();

    }
}

