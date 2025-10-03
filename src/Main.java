import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] tests = {1, 6, 10, 12, 14, 15, 153};
        for (int i = 0; i < tests.length; i++) {   // classic index loop
            int x = tests[i];
            PositiveInteger p = new PositiveInteger(x);
            System.out.println(x + " perfect? " + p.isPerfect());
            System.out.println(x + " Abundant? " + p.isAbundant());
            System.out.println(x + " Narcissistic? " + p.isNarcissistic());
        }
        //needle testing
        Scanner sc = new Scanner(System.in);
        System.out.println("Drops in total: ");
        int D = sc.nextInt(); //input number of drops
        double pi = new Needle().runExperiment(D);
        System.out.println("Pi is: " + pi);

    }
}
