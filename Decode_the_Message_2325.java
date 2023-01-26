package leetcode;

import java.util.HashMap;
import java.util.Map;

class Solution2325 {
	public String decodeMessage(String key, String message) {
		StringBuffer sb = new StringBuffer();
		key = key.replace(" ", "");
		Map<Character, Character> mapper = new HashMap<>();
		char original = 'a';
		for (int i = 0; i < key.length(); i++) {
			if (!mapper.containsKey(key.charAt(i))) {
				mapper.put(key.charAt(i), original++);
			}
		}
		for (int i = 0; i < message.length(); i++) {
			if (message.charAt(i) == ' ') {
				sb.append(" ");
			} else
				sb.append(mapper.get(message.charAt(i)));
		}
		return sb.toString();
	}
}

public class Decode_the_Message_2325 {

	public static void main(String[] args) {
		String key = "eljuxhpwnyrdgtqkviszcfmabo";
		String message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";
		Solution2325 ns = new Solution2325();
		System.out.println(ns.decodeMessage(key, message));
	}

}
