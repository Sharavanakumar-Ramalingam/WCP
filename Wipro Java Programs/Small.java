import java.util.*;
public class Small{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();
        Arrays.sort(a);
        System.out.println("Smallest: " + a[0] + ", " + a[1]);
        System.out.println("Largest: " + a[n - 2] + ", " + a[n - 1]);
    }
}
