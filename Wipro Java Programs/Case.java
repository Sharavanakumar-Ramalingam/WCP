import java.util.Scanner;
public class Case {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char c=s.next().charAt(0);
        if (Character.isLowerCase(c))
            System.out.println(Character.toUpperCase(c));
        else
            System.out.println(Character.toLowerCase(c));
    }
}
