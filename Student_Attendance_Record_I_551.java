package leetcode;

class Solution551 {
	public boolean checkRecord(String s) {
		int abs_count = 0;
		int late_count = 0;
		for (int i = 0; i < s.length(); i++) {
			char curr = s.charAt(i);
			if (curr == 'A') {
				abs_count++;
				if (abs_count >= 2) {
					return false;
				}
			} else if (curr == 'L') {
				late_count++;
				if (late_count >= 3) {
					return false;
				}
			}
			if (curr != 'L') {
				late_count = 0;
			}
		}
		return true;
	}
}

public class Student_Attendance_Record_I_551 {

	public static void main(String[] args) {
		Solution551 ns = new Solution551();
		String s = "PPLAPPLLPLLLL";
		System.out.println(ns.checkRecord(s));
	}

}
