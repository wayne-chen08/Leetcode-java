package leetcode;
/*
There is a robot starting at the position (0, 0), the origin, on a 2D plane. 
Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.

You are given a string moves that represents the move sequence of the robot where moves[i] represents its ith move. 
Valid moves are 'R' (right), 'L' (left), 'U' (up), and 'D' (down).

Return true if the robot returns to the origin after it finishes all of its moves, or false otherwise.

Note: The way that the robot is "facing" is irrelevant. 
'R' will always make the robot move to the right once, 'L' will always make it move left, etc. 
Also, assume that the magnitude of the robot's movement is the same for each move.
*/
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
        if(origin[0] == 0 && origin[1] == 0)
        	return true;
        return false;
    }

}
