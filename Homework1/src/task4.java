import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numnber A: ");
        int A = sc.nextInt();
        System.out.print("Enter numnber B: ");
        int B = sc.nextInt();
        if (A < B) {
            System.out.print(A + " " + B);
        } else {
            System.out.print(B + " " + A);
        }
    }
}