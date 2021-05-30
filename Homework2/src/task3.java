public class task3 {
    public static void main(String[] args) {
        int i = -12;
        while (i <= 10) {
            i = i + 1;
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
