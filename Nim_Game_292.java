package leetcode;

class Solution292 {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}

public class Nim_Game_292 {
    public static void main(String[] args) {
        int n = 5;
        Solution292 s = new Solution292();
        System.out.println(s.canWinNim(n));
    }
}
