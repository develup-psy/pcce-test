package basic.exam04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddArray {
    public static void main(String[] args) {
        int[] arr = {5,1,4};
        List<Integer> arrayList = new ArrayList<>();
        for(int i: arr){
            for(int j=0; j<i; j++){
                arrayList.add(i);
            }
        }
        int[] result = new int[arrayList.size()];
        for(int i=0; i<result.length; i++){
            result[i] = arrayList.get(i);
        }
        System.out.println(Arrays.toString(result));
        System.out.println(upgrade(arr));
    }
    static int[] upgrade(int[] arr){
        int[] answer = {};

        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }

        answer = new int[sum];

        int idx = 0;

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i]; j++) {
                answer[idx++] = arr[i];
            }
        }

        return answer;
    }
}
