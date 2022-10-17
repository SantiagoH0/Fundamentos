package fundamentos;

import java.util.Scanner;

public class Condicional04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = sc.next();

        System.out.println("Ingrese el salario:");
        float salario = sc.nextFloat();

        System.out.println("Ingrese los años de antigüedad:");
        int años = sc.nextInt();

        if (salario < 2340000 || años >10){
            System.out.println(nombre + " merece el aumento ");

        }else{
            System.out.println(nombre + " no merece el aumento");

        }



    }
}
