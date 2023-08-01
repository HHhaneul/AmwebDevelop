package exam02;
//Ex05 예제를 메서드 체이닝을 사용하여 짧게 사용하기
public class Ex06 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer(100);

        //메서드 체이닝
        String str =
                sb1.append("ABC").
                append("DEF").
                append("GHI").
                        toString();

        System.out.println(str);
    }
}
