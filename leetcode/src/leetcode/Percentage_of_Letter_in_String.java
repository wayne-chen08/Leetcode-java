package leetcode;

public class Percentage_of_Letter_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "foobar";
		char letter = 'o';
		System.out.print(percentageLetter(s, letter));
	}
	
	public static int percentageLetter(String s, char letter) {
        double count = 0;
        for(char c : s.toCharArray()) {
        	if(letter == c) {
        		count++;
        	}
        }
        return (int)(count / s.length() * 100);
    }
}
