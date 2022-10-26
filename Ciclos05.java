package fundamentos;

import java.util.Scanner;

public class Ciclos05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int students = sc.nextInt();
        int i = 0;

        while (i <= students){
            sc.nextLine();
            System.out.println("¿What is the student´s name?");
            String name = sc.nextLine();
            System.out.println("Enter the amount of credits:");
            int credits = sc.nextInt();
            System.out.println("Enter your stratum:");
            int stratum = sc.nextInt();
            float credit_value = 85000;
            double tuiton_cost = 0;
            double discount = 0;


            if (credits <= 20){
                tuiton_cost = credit_value * credits;
            } else {
                int extra_credits = credits - 20;
                tuiton_cost = extra_credits * (credit_value * 2);
                tuiton_cost = tuiton_cost + (85000 * 20);
            }

            if (stratum == 1){
                 tuiton_cost = tuiton_cost - (tuiton_cost * 0.8);
                System.out.println();

            } else if (stratum == 2) {
                tuiton_cost = tuiton_cost - (tuiton_cost * 0.5);

            } else if (stratum == 3) {
                tuiton_cost = tuiton_cost - (tuiton_cost + 0.3);

            }
            System.out.println(tuiton_cost);

        }

    }
}
