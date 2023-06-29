package leetcode;
/*You are given an m x n matrix M initialized with all 0's and an array of operations ops, 
where ops[i] = [ai, bi] means M[x][y] should be incremented by one for all 0 <= x < ai and 0 <= y < bi.

Count and return the number of maximum integers in the matrix after performing all the operations.
*/
//找出最小的x和y相乘
public class Range_Addition_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 6, n = 17;
		int[][]ops = {{1,4},{5,5},{4,9},{1,10},{6,2},{1,11},{4,6},{2,2},{3,15},{6,14},{1,17},{2,8},{4,7},{2,7}};
		System.out.println(maxCount(m, n, ops));
	}
	
	public static int maxCount(int m , int n, int[][] ops) {
		if(m == 0 || n == 0 || ops.length == 0){
			return m * n;
		}
		int min_a = ops[0][0], min_b = ops[0][1];
		for(int i = 0; i < ops.length; i++) {
			if(ops[i][0] < min_a) {
				min_a = ops[i][0];
			}
			if(ops[i][1] < min_b) {
				min_b = ops[i][1];
			}
		}
		return min_a * min_b;
	}

}
