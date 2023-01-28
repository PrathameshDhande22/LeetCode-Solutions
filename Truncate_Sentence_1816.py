class Solution1816:
    def truncateSentence(self, s: str, k: int) -> str:
        s = s.split()
        ans = ""
        for i in range(0, k):
            if i == k-1:
                ans += f"{s[i]}"
            else:
                ans += f"{s[i]} "
        return ans


if __name__ == '__main__':
    ob = Solution1816()
    s = "chopper is not a tanuki"
    k = 5
    print(ob.truncateSentence(s, k))
