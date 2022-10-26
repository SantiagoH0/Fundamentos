package fundamentos;

public class Ciclos03 {
    public static void main(String[] args) {

        int x = 0;
        while (x <= 10) {
            if (x == 5) {
                break;
            }
            x++;
            System.out.println(x);
        }
    }
}
