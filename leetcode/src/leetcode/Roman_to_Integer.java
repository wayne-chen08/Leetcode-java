package leetcode;
//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
public class Roman_to_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "MCMXCIV";
		System.out.print(romanToInt(s));
	}
	
	public static int romanToInt(String s) {
        int sum = 0;
        
        for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i) == 'I') {
        		if(i < s.length() - 1 && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X'))
        			sum += -1;
        		else
        			sum += 1;
        	}
        	else if(s.charAt(i) == 'V') {
        		sum += 5;
        	}
        	else if(s.charAt(i) == 'X') {
        		if(i < s.length() - 1 && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C'))
        			sum += -10;
        		else
        			sum += 10;
        	}
        	else if(s.charAt(i) == 'L') {
        		sum += 50;
        	}
        	else if(s.charAt(i) == 'C') {
        		if(i < s.length() - 1 && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M'))
        			sum += -100;
        		else sum += 100;
        	}
        	else if(s.charAt(i) == 'D') {
        		sum += 500;
        	}
        	else if(s.charAt(i) == 'M') {
        		sum += 1000;
        	}
        }
        return sum;
    }

}
