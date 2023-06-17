package leetcode;

public class Palindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 121;
		System.out.print(isPalindrome(x));
	}
	
	public static boolean isPalindrome(int x) {
        String y = Integer.toString(x);
        String result = "";
        for(int i = y.length() - 1; i >= 0; i--) {
        	result += y.charAt(i);
        }
        if(result.equals(y))
        	return true;
        return false;
    }

}
