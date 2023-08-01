package exam02;
// 객체를 생성을 해주어서 인스턴스 영역을 차지하므로 다른 주소 값을 가지게 됌.
public class Ex01 {
    public static void main(String[] args) {
        String str1 = new String ("ABC");
        String str2 = new String ("ABC");
        //동일성
        System.out.println("str1 주소 : " + System.identityHashCode(str1));
        System.out.println("str2 주소 : " + System.identityHashCode(str2));

        //동등성
        System.out.println("str1 주소 : " + str1.hashCode());
        System.out.println("str2 주소 : " + str2.hashCode());

        System.out.println("str1 == str2 : " + (str1 == str2));
    }
}
