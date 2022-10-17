package fundamentos;

import java.util.Scanner;

public class Condicional05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first value: ");
        int number1 = sc.nextInt();

        System.out.println("Enter the second value: ");
        int number2 = sc.nextInt();

        if (number1 == number2){
            float suma = (number1+number2);
            System.out.println("The sum is: "+ suma);

        } else if (number1 < number2) {
            double random = (Math.random() * ((number2 - number1)+1)) + number1;
            System.out.println("The random value is: "+ random);

        } else if (number1 < 0 && number2 < 0) {
            System.out.println("The absolute value of the first number is: " + Math.abs(number1));
            System.out.println("The absolute value of the second number is: " + Math.abs(number2));


        }

    }
}
