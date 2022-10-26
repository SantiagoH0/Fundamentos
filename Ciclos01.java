package fundamentos;

public class Ciclos01 {
    public static void main(String[] args) {

        for (int x = 0; x <= 10; x++){
            System.out.println("Hello World");
        }

        int x = 0;
        while (x <= 10){
            System.out.println("Hello World");
            x++;
        }

        int i = 0;
        do{
            System.out.println("Hello World");
            i++;
        }while (i <= 10);
    }
}
