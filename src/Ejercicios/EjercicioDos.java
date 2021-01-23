package Ejercicios;

import java.util.Scanner;

public class EjercicioDos {

        public static void main(String[] args) {

            //Instanciamos el Scanner
            Scanner leer = new Scanner(System.in);


            int a = 10;
            int suma = 0;

            for (int b =0 ;b<a;b++){
                System.out.println("Ingrese un numero:");
                int c = leer.nextInt();
                suma = suma + c;

            }

            System.out.println("El resultado es:" + suma);

        }
    }



