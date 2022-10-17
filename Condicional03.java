package fundamentos;

import java.util.Scanner;

public class Condicional03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en °C:");
        float cantidad = sc.nextFloat();

        if (cantidad < 0){
            System.out.println("ESTAMOS QUE NOS CONGELAMOS");

        } else if (cantidad >= 1 && cantidad <= 10) {
            System.out.println("ESTÁ HACIENDO MUCHO FRÍO");

        } else if (cantidad > 10 && cantidad <= 15) {
            System.out.println("EL CLIMA ESTÁ FRESCO");

        } else if (cantidad > 15 && cantidad <= 22) {
            System.out.println("LLEGÓ LA PRIMAVERA");

        }else {
            System.out.println("HACE CALOR");
        }


    }
}
