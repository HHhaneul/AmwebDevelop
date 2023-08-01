package exam03;

public class Ex05 {
    public static void main(String[] args) {
        double result1 = add(10,123.12f);
        System.out.println(result1);

        double result2 = add(10.1234, 10l);
        System.out.println(result2);

        double result3 = add(10, 20l);
        System.out.println(result3);
    }

    public static double add(Number num1, Number num2){
        double result = num1.doubleValue() + num2.doubleValue();

        return result;
    }
}
