package exam02;

public class Ex05 {
    public static void main(String[] args) {
        //StringBuffer 사용하여 가상메모리 공간을 만든 후 사용할 때
        //가상메모리 공간을 삭제해주고 따로 메모리 공간을 생성하여 사용하여 출력한다.
        StringBuffer sb1 = new StringBuffer(100);
        System.out.println("sb1의 주소 : " + System.identityHashCode(sb1));

        StringBuffer sb2 = sb1.append("ABC");
        System.out.println("sb2의 주소 : " + System.identityHashCode(sb2));

        StringBuffer sb3 = sb2.append("DEF");
        System.out.println("sb3의 주소 : " + System.identityHashCode(sb3));

        StringBuffer sb4 = sb3.append("GHI");
        System.out.println("sb4의 주소 : " + System.identityHashCode(sb4));

        String str1 = sb4.toString();
        System.out.println(str1);
        System.out.println("str1의 주소 : " + System.identityHashCode(str1));

    }
}
