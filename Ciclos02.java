package fundamentos;

public class Ciclos02 {
    public static void main(String[] args) {

        int x = 0;
        while (x <= 10){
            x++;
            if (x == 5){
                continue;
            }
            System.out.println(x);
        }
    }
}
