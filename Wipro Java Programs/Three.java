import java.util.Scanner;
public class Three{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] a = new int[3][3];
        int max = Integer.MIN_VALUE;
        System.out.println("Enter 9 integers for 3x3 matrix:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                a[i][j] = s.nextInt();
                if (a[i][j] > max)
                    max = a[i][j];
            }

        System.out.println("The given array is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }

        System.out.println("The biggest number in the given array is " + max);
    }
}
