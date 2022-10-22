public class SimpleNumber {
    private int divider = 2;

    public boolean isSimpleNumber(int number) {
        if (divider == number) {
            divider = 2;
            return true;
        } else if (number % divider == 0 || number < 2) {
            return false;
        } else {
            divider++;
            return isSimpleNumber(number);
        }
    }
}

