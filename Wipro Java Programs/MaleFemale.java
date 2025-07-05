import java.util.Scanner;
public class MaleFemale{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String g = s.next();
        int a = s.nextInt();
        if (g.equalsIgnoreCase("Female") && a >= 1 && a <= 58)
            System.out.println("8.2%");
        else if (g.equalsIgnoreCase("Female") && a <= 100)
            System.out.println("9.2%");
        else if (g.equalsIgnoreCase("Male") && a >= 1 && a <= 58)
            System.out.println("8.4%");
        else if (g.equalsIgnoreCase("Male") && a <= 100)
            System.out.println("10.5%");
    }
}
