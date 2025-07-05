import java.util.Scanner;
public class Search{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = s.nextInt();
        int x = s.nextInt();
        int f = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                f = i;
                break;
            }
        }
        System.out.println(f);
    }
}
