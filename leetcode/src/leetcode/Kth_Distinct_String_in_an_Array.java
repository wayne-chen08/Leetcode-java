package leetcode;
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