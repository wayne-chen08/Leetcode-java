package leetcode;

public class Design_Parking_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var obj = new ParkingSystem(1, 1, 0);
		System.out.print(obj.addCar(1) + " ");
		System.out.print(obj.addCar(2) + " ");
		System.out.print(obj.addCar(3) + " ");
		System.out.print(obj.addCar(1) + " ");
	}

}

class ParkingSystem {
	
	private int big, medium, small;
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        if(carType == 1) {
        	if(big > 0) {
        		big--;
        		return true;
        	}
        	return false;
        }
        
        if(carType == 2) {
        	if(medium > 0) {
        		medium--;
        		return true;
        	}
        	return false;
        }
        
        else {
        	if(small > 0) {
        		small--;
        		return true;
        	}
        	return false;
        }
    }
}
