package leetcode;
/* 
given a positive integer n. Each digit of n has a sign according to the following rules:
The most significant digit is assigned a positive sign.
Each other digit has an opposite sign to its adjacent digits.
Return the sum of all digits with their corresponding sign. 
*/
public class Alternating_Digit_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 886996;
		System.out.print(alternateDigitSum(n));
	}
	
	public static int alternateDigitSum(int n) {
        	boolean plus = true;
        	int sum = 0;
        	char[] c_arr = Integer.toString(n).toCharArray();
        	int[] int_arr = new int[c_arr.length];
        	for(int i = 0; i < int_arr.length; i++) {
        		int_arr[i] = (int)c_arr[i] - 48;
        	}
        
        	for(int i : int_arr) {
        		if(plus) {
        			sum += i;
        			plus = false;
        			continue;
        		}
        		else {
        			sum -= i;
        			plus = true;
        			continue;
        		}
        	}
        
        	return sum;
    	}

}
