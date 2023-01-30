class Solution557:
    def reverseWords(self, s: str) -> str:
        ans = ""
        s = s.split()
        for index, words in enumerate(s):
            if index == len(s)-1:
                ans += f"{words[::-1]}"
            else:
                ans += f"{words[::-1]} "
        return ans


if __name__ == '__main__':
    ob = Solution557()
    print(ob.reverseWords("Let's take LeetCode contest"))
