package fundamentos;

import java.util.Scanner;

public class Condicional06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String one = sc.nextLine();

        System.out.println("Enter the second string: ");
        String two = sc.nextLine();

        String one_may = one.toUpperCase();
        String two_may = two.toUpperCase();

        int total_one = one_may.length();
        int total_two = two_may.length();

        if (total_one > total_two){
            System.out.println(one_may + " has more characters");

        }else if (total_two > total_one) {
        System.out.println(two_may + " has more characters");

        }else {
            System.out.println(one_may + " y " + two_may + " have the same number of characters");
        }

        System.out.println("First string: " + one_may);
        System.out.println("Second string: "+ two_may);







    }
}
