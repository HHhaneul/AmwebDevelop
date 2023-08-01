package exam01;

public class Ex06 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 2;
            int result = num1 / num2 ; // ArithmethicException
            System.out.println(result);

            String str = null;
            str = str.toUpperCase(); // 무슨 예외가 발생할 지 모르는 경우
            System.out.println(str);

        }catch (Exception e){ // Exception e = new NullPointerException(....);
            String message = e.getMessage();
            System.out.println(message);
            System.out.println("Exception");

        }
/*        catch (ArithmeticException e){
            String message = e.getMessage();
            System.out.println(message);
        } Exception 다형성으로 먼저 catch를 해주었기 때문에 하위 클래스 사용 불가!*/
    }
}

