package tumgorunumler;

import java.util.Arrays;
import java.util.LinkedList;

public class Goruntule extends ElemanGorunumSayisi {

    //  Input: nums = [1,2,3]
    //  Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        //System.out.println(nums);

        int arrDisIdx = gorunumSayisi(nums.size());

        int[][] arr = new int[arrDisIdx][nums.size()];

        int a = 0;
        int b = 0;


        for (int i = 0; i < arrDisIdx; i++) {
           if(b!=0 && b%(nums.size()-1)==0)
               a++;

            arr[i][0] = nums.get(a);

            }



    }
}





