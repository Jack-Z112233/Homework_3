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
        if (num < 10) return true; //by definition
        int digits = 0;
        int z = num;
        while (z > 0){
            digits++; // adds one digit
            z = z / 10; // deletes one digit or else there will be one more digit
        } // counts how many digits are there in num
         // for example, 3000 will make digits=4
        int digitpowered = 0;
        z = num;
        while (z > 0){
            int lastdigit = z % 10; // provides the last digit
            digitpowered += (int) Math.pow(lastdigit, digits); // calculates the power of each digit
            // and adds it to the total digit powered
            z = z / 10; //now the last digit is done, drop it and do the next digit
        }
        return digitpowered == num; // if digitpowered is the num, it is narcissistic
    }

}