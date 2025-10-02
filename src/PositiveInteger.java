public class PositiveInteger {

    private int num;

    public PositiveInteger(int number) {
        num = number;
    }

    public boolean isPerfect() {
        if (num == 1) return false;
        int x = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) x += i;
        }
        return x == num;
    }


    public boolean isAbundant() {
        if (num == 1) return false;
        int x = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) x += i;
        }
        return x > num;
    }

    public boolean isNarcissistic() {

        return false;
    }
}