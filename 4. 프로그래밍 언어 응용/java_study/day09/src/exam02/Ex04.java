package exam02;
//String은 final byte[]이므로 공간은 고정이다.
//기존에 있던 데이터 공간을 버리고 새로운 공간에 들어가게 된다.
//그렇기에 주소 값은 다른 값이 나오게 된다.
public class Ex04 {
    public static void main(String[] args) {
        String str = "ABC";
        System.out.println("주소 : " + System.identityHashCode(str));

        str += "DEF";
        System.out.println("주소 : " + System.identityHashCode(str));

        str += "GHI";
        System.out.println("주소 : " + System.identityHashCode(str));
    }
}
