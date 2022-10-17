package fundamentos;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número entero:");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo número entero:");
        int numero2 = sc.nextInt();
        int suma = numero1+numero2;
        int resta = numero1-numero2;
        int producto = numero1*numero2;
        double promedio = suma/2;
        int maximo= Math.max(numero1,numero2);
        int minimo= Math.min(numero1,numero2);

        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("El producto es: "+producto);
        System.out.println("El promedio es: "+promedio);
        System.out.println("El numero mayor es: "+maximo);
        System.out.println("El numero menor es: "+minimo);




    }

}
