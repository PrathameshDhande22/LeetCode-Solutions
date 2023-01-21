package leetcode;

import java.util.Arrays;

class Solution2469 {
	public double[] convertTemperature(double celsius) {
		double[] temps = new double[2];
		temps[0] = celsius + 273.15;
		temps[1] = celsius * 1.80 + 32.00;
		return temps;
	}
}

public class Convert_the_Temperature_2469 {

	public static void main(String[] args) {
		Solution2469 ns = new Solution2469();
		System.out.println(Arrays.toString(ns.convertTemperature(36.50)));
	}

}
