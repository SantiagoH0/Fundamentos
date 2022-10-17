package fundamentos;

import java.util.Scanner;

public class Condicional02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer valor:");
        int valor1 = sc.nextInt();

        System.out.println("Ingrese el segundo valor:");
        int valor2 = sc.nextInt();

        System.out.println("Ingrese el tercer valor:");
        int valor3 = sc.nextInt();

        if (valor1 > valor2 && valor1 > valor3) {
            System.out.println("El número mayor es: "+valor1);

        } else if (valor2 > valor3 && valor2 > valor3) {
            System.out.println("El número mayor es: "+valor2);

        }else{
            System.out.println("El número mayor es: "+valor3);
        }

    }
}
