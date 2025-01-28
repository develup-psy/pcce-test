package basic.exam03;
import java.util.Arrays;
public class Queries {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2},{0,3,2},{0,2,2}};
        int[] resultArr = new int[queries.length];

        for(int i=0; i<queries.length; i++){
            //query: [s,e,k]
            //<s <= i <= e
            //k < arr[i]
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            boolean isValue = false;
            int min = 1000000;
            for(int j=s; j<=e; j++){
                if(arr[j] > k){
                    isValue = true;
                    if(min > arr[j]) min = arr[j];
                }
            }
            if(isValue){
                resultArr[i] = min;
            }else{
                resultArr[i] = -1;
            }
        }
        System.out.println(Arrays.toString(resultArr));
        System.out.println(Arrays.toString(upgrade(arr, queries)));
    }
    static int[] upgrade(int[] arr, int[][] queries){
        int[] answer = new int[queries.length];
        Arrays.fill(answer, -1);

        for (int idx = 0; idx < queries.length; idx++) {
            int[] query = queries[idx];
            int s = query[0], e = query[1], k = query[2];

            for (int i = s; i <= e; i++) {
                if (k < arr[i]) {
                    answer[idx] = answer[idx] == -1 ? arr[i] : Math.min(answer[idx], arr[i]);
                }
            }

        }

        return answer;
    }
}
