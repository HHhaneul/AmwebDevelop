package exam02;
// 객체를 생성을 해주지 않음.
// 인스턴스 영역을 차지하지 않으며 데이터 영역을 차지하며 같은 주소 값을 가짐
public class Ex02 {
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "ABC";

        System.out.println("str1 주소 : " + System.identityHashCode(str1));
        System.out.println("str2 주소 : " + System.identityHashCode(str2));

        System.out.println("str1 == str2 : " + (str1 == str2));
    }
}

