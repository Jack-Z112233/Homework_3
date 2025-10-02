//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                int[] tests = {1, 6, 10, 12, 15};
                for (int i = 0; i < tests.length; i++) {   // classic index loop
                    int x = tests[i];
                    PositiveInteger p = new PositiveInteger(x);
                    System.out.println(x + " perfect? " + p.isPerfect());
                    System.out.println(x + " Abundant? " + p.isAbundant());

                }
            }
        }