import java.util.Scanner;

public class task10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a = sc.nextInt();
        boolean prime = a >= 2;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println("Prime");
        } else {
            System.out.println("No Prime");
        }
    }
}

