import java.util.Scanner;
public class Ascii{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();
        for (int i : a)
            System.out.print((char) i + " ");
    }
}
