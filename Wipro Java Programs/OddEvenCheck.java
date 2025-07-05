import java.util.Scanner;

public class OddEvenCheck{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int num=scanner.nextInt();
        if (num%2==0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
        scanner.close();
    }
}
