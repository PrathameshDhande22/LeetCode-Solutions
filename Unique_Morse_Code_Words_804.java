package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution804 {
	private String[] Morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
			"--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };;
	private Map<Character, String> morseChar;

	private void Intialize() {
		morseChar = new HashMap<>();
		char start = 'a';
		for (String m : Morse) {
			morseChar.put(start++, m);
		}
	}

	public int UniqueMorseRepresentations(String[] words) {
		Intialize();
		HashSet<String> transformation = new HashSet<>();
		for (String word : words) {
			transformation.add(getString(word));
		}
		return transformation.size();
	}

	private String getString(String word) {
		StringBuffer sb = new StringBuffer();
		for (char a : word.toCharArray()) {
			sb.append(morseChar.get(a));
		}
		return sb.toString();
	}
}

public class Unique_Morse_Code_Words_804 {

	public static void main(String[] args) {
		String[] words = { "a" };
		Solution804 ns = new Solution804();
		System.out.println(ns.UniqueMorseRepresentations(words));
	}

}
