import java.util.Scanner;
public class Triangle1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt(), n = 1;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(n++ + " ");
            System.out.println();
        }
    }
}
