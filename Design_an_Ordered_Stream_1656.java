package leetcode;

import java.util.ArrayList;
import java.util.List;

class OrderedStream {
	private int size;
	private String[] values;
	private int ptr = 0;

	public OrderedStream(int n) {
		this.size = n;
		values = new String[this.size];
	}

	public List<String> insert(int idKey, String value) {
		List<String> stream = new ArrayList<>();
		values[idKey - 1] = value;
		while (ptr < size) {
			if (values[ptr] == null) {
				return stream;
			} else {
				stream.add(values[ptr]);
				ptr++;
			}
		}
		return stream;

	}
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n); List<String> param_1 =
 * obj.insert(idKey,value);
 */

public class Design_an_Ordered_Stream_1656 {

	public static void main(String[] args) {
		OrderedStream os = new OrderedStream(5);
		System.out.println(os.insert(3, "ccccc")); // Inserts (3, "ccccc"), returns [].
		System.out.println(os.insert(1, "aaaaa")); // Inserts (1, "aaaaa"), returns ["aaaaa"].
		System.out.println(os.insert(2, "bbbbb")); // Inserts (2, "bbbbb"), returns ["bbbbb", "ccccc"].
		System.out.println(os.insert(5, "eeeee")); // Inserts (5, "eeeee"), returns [].
		System.out.println(os.insert(4, "ddddd")); // Inserts (4, "ddddd"), returns ["ddddd", "eeeee"].

	}

}
