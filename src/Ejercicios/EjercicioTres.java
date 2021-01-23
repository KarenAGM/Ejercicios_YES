package Ejercicios;

import java.util.Scanner;

public class EjercicioTres {

    public static void main(String[] args) {

        //Instanciamos el scanner
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el numero de veces que quiere sumar");
        int n = leer.nextInt();
        int b=0;
        int suma =0;

        while ( b < n){
            System.out.println("Ingrese un numero a sumar");
            int x = leer.nextInt();
            suma += n;

            b++;
        }

        System.out.println("El resultado de la suma es: " + suma);

    }

}
