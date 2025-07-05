public class Divisble{
    public static void main(String[] args) {
        int i = 1, c = 0;
        while (c < 5) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                c++;
            }
            i++;
        }
    }
}
