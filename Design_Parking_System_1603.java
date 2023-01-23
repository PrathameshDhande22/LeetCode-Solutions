package leetcode;

class ParkingSystem {
	private int big, medium, small;

	public ParkingSystem(int big, int medium, int small) {
		this.big = big;
		this.medium = medium;
		this.small = small;
	}

	public boolean addCar(int carType) {
		if (big >= 1 && carType == 1) {
			big--;
			return true;
		} else if (medium >= 1 && carType == 2) {
			medium--;
			return true;
		} else if (small >= 1 && carType == 3) {
			small--;
			return true;
		}
		return false;
	}
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small); boolean param_1 =
 * obj.addCar(carType);
 */
public class Design_Parking_System_1603 {

	public static void main(String[] args) {
		ParkingSystem obj = new ParkingSystem(1, 1, 0);
		System.out.println(obj.addCar(1));
		System.out.println(obj.addCar(2));
		System.out.println(obj.addCar(3));
		System.out.println(obj.addCar(1));
	}

}
