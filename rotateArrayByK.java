import java.util.ArrayList;

public class rotateArrayByK {
    public static void reverse(ArrayList<Integer> arr , int i , int j){
        int t;
        while(i < j){
            t = arr.get(i);
            arr.set(i , arr.get(j));
            arr.set(j , t);
            i++;
            j--;
        }
    }
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        reverse(arr , 0 , k-1);
        reverse(arr , k , n-1);
        reverse(arr , 0 , n-1);
        return arr;
    }
}