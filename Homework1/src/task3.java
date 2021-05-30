import java.util.Scanner;

public class task3 {
    public static void change(int a1, int a2) {
        int temp = a1;
        a1 = a2;
        a2 = temp;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter numnber a1: ");
        int a1 = Integer.parseInt(console.nextLine());
        System.out.print("Enter numnber a2: ");
        int a2 = Integer.parseInt(console.nextLine());
        System.out.println("Before exchange: " + "a1= " + a1 + " a2= " + a2);
        change(a1, a2);
        System.out.println("After exchange: " + "a1= " + a2 + " a2= " + a1);
    }
}
