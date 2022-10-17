package fundamentos;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de pulgadas:");
        double pulgadas = sc.nextInt();

        double metros = (pulgadas*0.0254);
        System.out.println("La cantidad de metros es: "+metros);
    }
}
