package leetcode;
//Implement pow(x, n), which calculates x raised to the power n.
public class Pow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = -1.00000;
		int n = 2147483647;
		System.out.print(myPow(x, n));
	}
	
	public static double myPow(double x, int n) {
		//用return Math.pow(x, n);會更快
		double temp = x;
        	if(x == 1)
           	 return 1;
       	 	else if(x == -1) {
        		if(n % 2 == 0) {
        			return 1;
        		}
        		else {
        			return -1;
        		}
        	}
        	if(n == 0){
            	return 1;
        	}

        	if(n < 0){
        		x = 1 / x;
        		temp = x;
        		n = -n;
            	while(n % 2 == 0) {
            		n /= 2;
            		x *= temp;
            		temp = x;
            	}
            	for(int i = 1; i < n; i++){
                	x *= temp;
            	}
            
        	}

        	else{
            	while(n % 2 == 0) {
            		n /= 2;
            		x *= temp;
            		temp = x;
            	}
            
            	for(int i = 1; i < n; i++){
                	x *= temp;
            	}

        	}
        	return x;
    	}

}
