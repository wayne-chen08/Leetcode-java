package leetcode;

public class Longest_Common_Prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"abbb","a","accc","aa"};
		System.out.print(longestCommonPrefix(strs));
	}
	
	public static String longestCommonPrefix(String[] strs) {
		String result = "";
		
		if(strs.length == 1)
			return strs[0];
		
		int min = strs[0].length();
		for(int i = 1; i < strs.length; i++) {
			min = Math.min(min, strs[i].length());
		}
		
		if(min == 0)
			return "";
		
        for(int i = 0; i < min; i++) {
        	char temp = strs[0].charAt(i);
        	for(int j = 0; j < strs.length; j++) {
        		if(strs[j].charAt(i) != temp) {
        			temp = 0;
        			break;
        		}
        	}
        	if(temp != 0) 
        		result += temp;
        	else
        		break;
        }
        return result;
    }

}
