package fundamentos;

import java.util.Scanner;

public class Ciclos04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people to evaluate: ");
        int n = sc.nextInt();
        int i = 0;

        while (i <= n){
            System.out.println("Enter your weight: ");
            int weight = sc.nextInt();
            System.out.println("Enter your eight: ");
            float eight = sc.nextFloat();
            double imc = weight/Math.pow(eight,2);
            System.out.println("Your IMC is: "+ imc);
            i++;

            if (imc < 18) {
                System.out.println("This means that you are below normal");

            } else if (imc >= 18 && imc < 25) {
                System.out.println("This means that you are normal");

            } else if (imc >= 25 && imc < 30) {
                System.out.println("This means that you are overweight");

            } else if (imc >= 30 && imc < 35) {
                System.out.println("This means that you are moderately obese");

            } else if (imc >= 35 && imc < 40) {
                System.out.println("This means that you are severely obese");
                
            } else {
                System.out.println("This means that you are morbidly obese");
            }
        }
    }
}
