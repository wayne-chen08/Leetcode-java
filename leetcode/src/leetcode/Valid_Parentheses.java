package leetcode;

public class Valid_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "({{{{}}}))"; // false
		System.out.print(isValid(s));
	}
	
	public static boolean isValid(String s) {
		if(s.length() % 2 != 0) {
			return false;
		}
		boolean valid = false;
		
        for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i) == '(') {
        		valid = false;
        		for(int j = 1; j + i < s.length(); j += 2) {
        			if(s.charAt(j + i) == ')') {
        				valid = true;
        				break;
        			}		
        			else 
        				valid = false;
        		}
        	}
        	
        	else if(s.charAt(i) == '[') {
        		valid = false;
        		for(int j = 1; j + i < s.length(); j += 2) {
        			if(s.charAt(j + i) == ']') {
        				valid = true;
        				break;
        			}        				
        			else 
        				valid = false;
        		}
        	}
        	
        	else if(s.charAt(i) == '{') {
        		valid = false;
        		for(int j = 1; j + i < s.length(); j += 2) {
        			if(s.charAt(j + i) == '}') {
        				valid = true;
        				break;
        			}       				
        			else 
        				valid = false;
        		}
        	}
        }
        
        return valid;
    }

}
