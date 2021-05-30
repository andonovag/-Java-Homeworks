import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numnber A");
        double A = sc.nextDouble();
        System.out.println("Enter numnber B");
        double B = sc.nextDouble();
        System.out.println("Enter numnber C");
        double C = sc.nextDouble();
        if (C > A && C < B) {
            System.out.println("The number " + C + " " + "is between " + A + " " + "and " + B);
        } else {
            if (C < A) {
                System.out.println("The number " + C + " " + "is less than " + A);
            } else {
                if (C > B)
                    System.out.println("The number " + C + " " + "is greater than " + B);
            }
        }
    }
}
