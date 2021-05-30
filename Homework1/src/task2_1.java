import java.util.Scanner;

public class task2_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter numnber a:");
        double a = Double.parseDouble(console.nextLine());
        System.out.println("Enter numnber b:");
        double b = Double.parseDouble(console.nextLine());
        double sum = a + b;
        System.out.println("The sum is: " + sum);
        double difference = a - b;
        System.out.println("The difference is: " + difference);
        double multiply = a * b;
        System.out.println("The multiply is: " + multiply);
        double division = a / b;
        System.out.println("The division is: " + division);
        double remainder = a % b;
        System.out.println("The remainder is: " + remainder);
    }
}