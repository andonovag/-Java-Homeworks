import java.util.Scanner;

public class task7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Am I sick?");
        boolean healthy = sc.nextBoolean();
        if (healthy) {
            System.out.println("I'm not going out");
            System.out.println("Do I have money?");
            boolean money = sc.nextBoolean();
            if (money) {
                System.out.println("I'll buy medicaments");
                System.out.println("How much money do I have?");
                double SumMoney = sc.nextDouble();
                if (SumMoney > 10) {
                    System.out.println("I can buy medicaments");
                } else {
                    System.out.println("I'll stay at home and drink tea");
                }

            } else {
                System.out.println("I'll stay at home and drink tea");

            }
        } else {
            System.out.println("I'm going out");
            System.out.println("Do I have money?");
            boolean money = sc.nextBoolean();
            if (money) {
                System.out.println("I'll go to drink coffee");
                System.out.println("How much money do I have?");
                double SumMoney = sc.nextDouble();
                if (SumMoney > 10) {
                    System.out.println("Enjoy");
                } else {
                    System.out.println("I stay at home");
                }
            } else {
                System.out.println("I stay at home");
            }

        }
    }
}
