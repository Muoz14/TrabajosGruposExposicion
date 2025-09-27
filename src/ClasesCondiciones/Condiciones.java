package ClasesCondiciones;

public class Condiciones {

    public String parImpar(int numero){

        if (numero % 2 == 0){

            return "El numero ingresado es par";

        }
        else{

            return "El numero ingresado es impar";

        }

    }

    public void totalPagar(float pProducto){

        float subtotal, tPagar, descuento = 0;

        subtotal = pProducto;

        if (subtotal >= 100){

            System.out.println("El precio es mayor de 100, aplica a un descuento de 5%");

            descuento = 0.05F;

        }
        else{

            System.out.println("El precio es menor de 100, no aplica a descuento");

        }

        tPagar = subtotal - (subtotal * descuento);

        System.out.println("El subtotal es = " + subtotal);

        System.out.println("El total a pagar es = " + tPagar);

    }

    public String mayorMenor(int n1, int n2){

        if (n1 > n2){

            return "El numero " + n1 + " es mayor y " + n2 + " es el menor";


        }
        else{

            return "El numero " + n2 + " es mayor y " + n1 + " es el menor";

        }

    }

    public String mayorMenor3Nums(int n1, int n2, int n3){

        int ma = 0, me = 0;

        if (n1 > n2 && n1 > n3){

            ma = n1;


        }
        else if (n2 > n1 && n2 > n3){

            ma = n2;

        }
        else if (n3 > n1 && n3 > n2){

            ma = n3;

        }

        if (n1 < n2 && n1 < n3){

            me = n1;

        }
        else if (n2 < n1 && n2 < n3){

            me = n2;

        }
        else if (n3 < n1 && n3 < n2){

            me = n3;

        }

        return "El numero mayor es " + ma + " y el menor es " + me;

    }

    public String edades(int edad){


        if (edad < 18){

            return "Eres menor de edad";

        }
        else if (edad >= 18 && edad <= 20){

            return "Eres mayor de edad";

        }
        else if (edad >= 21 && edad <= 64){

            return "Tienes la mayoria de edad";

        }
        else if (edad >= 65){

            return "Eres de la tercera edad";

        }

        return "";
    }

    public float operaciones(int n1, int n2, String operacion){

        float resultado = 0;

        if (operacion.equals("+")){

            resultado = n1 + n2;

        }
        else if (operacion.equals("-")){

            resultado = n1 - n2;

        }
        else if (operacion.equals("*")){

            resultado = n1 * n2;

        }
        else if (operacion.equals("/")){

            resultado = (float) n1 / n2;

        }

        return resultado;

    }

    public String diaSemana(int numero){

        String respuesta = "";

        if (numero == 1){

            respuesta = "\nLunes";

        }
        else if (numero == 2){

            respuesta = "\nMartes";

        }
        else if (numero == 3){

            respuesta = "\nMiercoles";

        }
        else if (numero == 4){

            respuesta = "\nJueves";

        }
        else if (numero == 5){

            respuesta = "\nViernes";

        }
        else if (numero == 6){

            respuesta = "\nSabado";

        }
        else if (numero == 7){

            respuesta = "\nDomingo";

        }
        else if (numero < 1 || numero > 7){

            respuesta = "\nNumero ingresado no valido";

        }

        return respuesta;

    }

}
