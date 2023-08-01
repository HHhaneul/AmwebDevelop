package exam03;

public class Ex02 {
    public static void main(String[] args) {
        int num1 = 10;

        /**
         * 컴파일러
         * Integer num2 = Integer.valueOf(num1);
         */
        Integer num2 = num1; // num1 -> [Integer.valueOf](num1) / 오토박싱
    
        /**
         * 컴파일러
         * 
         * int num3 = num1 + num2.intValue()
         */
        int num3 = num1 + num2; // num2 -> num2.intValue() / 언박싱
        System.out.println(num3);
    }
}
