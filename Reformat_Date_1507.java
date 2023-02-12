package leetcode;

class Solution1507 {
	private static String[] mon = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
			"Dec" };

	public String reformatDate(String date) {
		String[] dateSplitted = date.split("\s");
		return dateSplitted[2] + "-" + giveMonth(dateSplitted[1]) + "-" + extractDay(dateSplitted[0]);
	}

	public String extractDay(String day) {
		day = day.substring(0, day.length() - 2);
		return day.length() == 2 ? day : "0" + day;
	}

	public String giveMonth(String month) {
		String ans = "";
		for (int i = 0; i < mon.length; i++) {
			if (month.equals(mon[i])) {
				ans = Integer.toString(i + 1);
				break;
			}
		}
		if (ans.length() != 2) {
			return "0" + ans;
		}
		return ans;
	}
}

public class Reformat_Date_1507 {

	public static void main(String[] args) {
		String date = "26th May 1960";
		Solution1507 ns = new Solution1507();
		System.out.println(ns.reformatDate(date));
//		System.out.println(ns.extractDay("21st"));
//		System.out.println(ns.giveMonth("Jan"));
	}

}
