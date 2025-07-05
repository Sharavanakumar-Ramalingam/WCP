import java.util.Scanner;
public class Pali{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), t = n, r = 0;
        while (n > 0) {
            r = r * 10 + n % 10;
            n /= 10;
        }
        if (t == r)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
