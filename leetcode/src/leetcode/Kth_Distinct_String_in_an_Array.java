package leetcode;
/*A distinct string is a string that is present only once in an array.

Given an array of strings arr, and an integer k, return the kth distinct string present in arr. 
If there are fewer than k distinct strings, return an empty string "".

Note that the strings are considered in the order in which they appear in the array.
*/
import java.util.ArrayList;
public class Kth_Distinct_String_in_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"d","b","c","b","c","a"}; int k = 2;
		System.out.print(kthDistinct(arr, k));
	}
	
	public static String kthDistinct(String[] arr, int k) {
		ArrayList <Integer> a = new ArrayList<Integer>();
		for(int i = 0; i < arr.length; i++) {
			boolean same = false;
			for(int j = 0; j < arr.length; j++) {
				if(arr[i].equals(arr[j]) && i != j) {
					same = true;
					break;
				}
			}
			if(!same)
				a.add(i);
		}
		if (k > a.size())
			return "";
		return arr[a.get(k - 1)];
	}

}
