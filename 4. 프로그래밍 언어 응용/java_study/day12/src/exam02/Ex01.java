package exam02;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("이름5");
        names.add("이름1");
        names.add("이름2");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        // 순서가 아예 없는 것은 아니다.
        // 검색에 특화 검색을 빠르게 하기 위함 hashcode 로 순서 결정
        System.out.println(names);
    }
}
