package exam01;

public class RecCalculator implements Calculator{
    @Override
    public long factorial(long num) {
            if (num < 1) return 1l;
            return num * factorial(num - 1);
    }
}
