import java.util.Scanner;

class homework1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int n = scanner.nextInt();

        int a;
        String c = "";
        while (n > 0) {
            a = n % 2;
            n = n / 2;
            c = a + c;
        }
        System.out.println(c);
    }
}