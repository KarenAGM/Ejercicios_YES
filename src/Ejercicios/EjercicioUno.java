package Ejercicios;

import java.util.Scanner;

public class EjercicioUno {

    public static void main(String[] args) {

        //Instanciamos el escaner
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int a = leer.nextInt();

        System.out.println("Ingrese otro numero");
        int b = leer.nextInt();

        int res = a + b;

        System.out.println("El resultado de la suma es: " + res);

    }

}