package exam03;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {
    public static void main(String[] args){
        int[] nums = new int[4]; // int 변수 4개 생성, 인덱스 번호 0, 1, 2, 3
        nums[0] = 10;
        nums[1] = 20;
        //nums[2] = 30;
        //nums[3] = 40;

        for (int i = 0; i < 4; i++){
            System.out.println(nums[i]);
        }
    }
}
