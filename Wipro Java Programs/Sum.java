import java.util.Scanner;
public class Sum{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), sum = 0;
        for (; n > 0; n /= 10)
            sum += n % 10;
        System.out.println(sum);
    }
}
