package leetcode;

public class Sqrt {//這題可以用binary search做

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2147483647;
		System.out.print(mySqrt(x));
	}
	
	public static int mySqrt(int x) {
		if(x == 1 || x == 2 || x == 3) {
			return 1;
		}
		int n = 1;
        for(long i = 1; i <= x / 2 + 1; i++) {
        	if(i * i >= x) {
        		if(i * i == x) {
        			n = (int)i;
        			break;
        		}
        		else {
        			n = (int)i - 1;
        			break;
        		}	
        	}
        }
        return n;
    }

}
