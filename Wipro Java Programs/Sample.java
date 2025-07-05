public class Sample {
    public static void main(String[] args) {
        if (args.length!=2) {
            System.out.println("Please provide exactly two integer arguments.");
            return;
        }
        try {
            int num1=Integer.parseInt(args[0]);
            int num2=Integer.parseInt(args[1]);
            int sum = num1+num2;
            System.out.println("The sum of "+num1+"and"+num2+"is"+sum);
        } catch(NumberFormatException e) {
            System.out.println("Please enter valid integers.");
        }
    }
}
