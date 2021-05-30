import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numnber A: ");
        int A = sc.nextInt();
        System.out.print("Enter numnber B: ");
        int B = sc.nextInt();
        System.out.print("Enter numnber C: ");
        int C = sc.nextInt();
        if (A > B && A > C) {
            if (B > C) {
                System.out.print(A + " " + B + " " + C);
            } else {
                System.out.print(A + " " + C + " " + B);
            }
        }
        if (B > A && B > C) {
            if (A > C) {
                System.out.print(B + " " + A + " " + C);
            } else {
                System.out.print(B + " " + C + " " + A);
            }
        }
        if (C > A && C > B) {
            if (A > B) {
                System.out.print(C + " " + A + " " + B);
            } else {
                System.out.print(C + " " + B + " " + A);
            }
        }
    }
}
