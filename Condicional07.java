package fundamentos;

import java.util.Scanner;

public class Condicional07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        switch (number){
            case 1: System.out.println("Selected option 1");
            break;

            case 2: System.out.println("Selected option 2");
            break;

            case 3: System.out.println("Selected option 3");
            break;

            case 4: System.out.println("Selected option 4");
            break;

            case 5: System.out.println("Selected option 5");
            break;

            default: System.out.println("No option selected");


        }


    }
}
