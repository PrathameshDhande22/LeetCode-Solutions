class Solution9:
    def isPalindrome(self, x: int) -> bool:
        num = str(x)[::-1]
        if (num == str(x)):
            return True
        else:
            return False


if __name__ == '__main__':
    s = Solution9()
    # x=121
    # x = -121
    x=10
    print(s.isPalindrome(x))
