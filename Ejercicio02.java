package fundamentos;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un valor:");
        int numero = sc.nextInt();

        double cuadrado = Math.pow(numero,2);
        double cubo = Math.pow(numero,3);
        double cuarta = Math.pow(numero,4);

        System.out.println("El cuadrado es: "+cuadrado);
        System.out.println("El cubo es: "+cubo);
        System.out.println("La cuarta es: "+cuarta);
    }
}
