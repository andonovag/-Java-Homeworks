import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter numnber a:");
        int a = Integer.parseInt(console.nextLine());
        System.out.println("Enter numnber b:");
        int b = Integer.parseInt(console.nextLine());
        int sum = a + b;
        System.out.println("The sum is: " + sum);
        int difference = a - b;
        System.out.println("The difference is: " + difference);
        int multiply = a * b;
        System.out.println("The multiply is: " + multiply);
        int division = a / b;
        System.out.println("The division is: " + division);
        int remainder = a % b;
        System.out.println("The remainder is: " + remainder);
    }
}