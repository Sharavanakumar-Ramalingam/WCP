import java.util.*;
public class Duplicate{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < n; i++)
            set.add(s.nextInt());
        for (int i : set)
            System.out.print(i + " ");
    }
}
