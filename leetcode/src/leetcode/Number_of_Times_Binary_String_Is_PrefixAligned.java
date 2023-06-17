package leetcode;

public class Number_of_Times_Binary_String_Is_PrefixAligned {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]flips = {};
		
		System.out.print(numTimesAllBlue(flips));
	}
	
	public static int numTimesAllBlue(int[] flips) {
		/*int[] result = new int[flips.length];
		int count = 0;
		for(int i = 0; i < flips.length; i++) {
			result[flips[i] - 1] = 1;
			int sum = 0;
			for(int j = 0; j <= i; j++) {
				sum += result[j];
			}
			if(i + 1 == sum)
				count++;
		}
		return count;*/
      	int right = 0, res = 0, n = flips.length;
        for (int i = 0; i < n; ++i) {
            right = Math.max(right, flips[i]);
            if (right == i + 1) ++res;
        }
        return res;
	}

}


