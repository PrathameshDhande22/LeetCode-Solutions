package leetcode;

class Solution925 {
	public boolean isLongPressedName(String name, String typed) {
		if (name.length() > typed.length()) {
			return false;
		}
		int name_ptr = 0;
		int typed_ptr = 0;
		char prev = ' ';
		char name_curr = name.charAt(name_ptr);
		while (name_ptr < name.length() && typed_ptr < typed.length()) {
			name_curr = name.charAt(name_ptr);
			char typed_curr = typed.charAt(typed_ptr);
			if (name_curr == typed_curr) {
				name_ptr++;
				typed_ptr++;
				prev = name_curr;
			} else if (prev == typed_curr) {
				typed_ptr++;
			} else {
				return false;
			}
		}
		while (typed_ptr < typed.length()) {
			char typed_curr = typed.charAt(typed_ptr);
			if (name_curr != typed_curr) {
				return false;
			}
			typed_ptr++;
		}
		return typed_ptr == typed.length() && name_ptr == name.length();
	}
}

public class Long_Pressed_Name_925 {

	public static void main(String[] args) {
		Solution925 ns = new Solution925();
		String name = "pyplrz", typed = "ppyypllr";
		System.out.println(ns.isLongPressedName(name, typed));
	}

}
