package leetcode;

public class Robot_Return_to_Origin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String moves = "LL";
		System.out.print(judgeCircle(moves));
	}
	
	public static boolean judgeCircle(String moves) {
        int[] origin = {0, 0}; 
        
        for(char c : moves.toCharArray()) {
        	switch(c) {
        	case 'R':
        		origin[0]++;
        		break;
        	case 'L':
        		origin[0]--;
        		break;
        	case 'U':
        		origin[1]++;
        		break;
        	case 'D':
        		origin[1]--;
        		break;
        	}
        }
        System.gc();
        if(origin[0] == 0 && origin[1] == 0)
        	return true;
        return false;
    }

}
