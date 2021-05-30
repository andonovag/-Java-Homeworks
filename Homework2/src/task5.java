import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        for (int i = b; b < a; b++) {
            System.out.print(b + " ");
            if (b == a) {
                break;
            }
        }
        for (int i = a; a <= b; a++) {
            System.out.print(a + " ");
        }
    }
}


