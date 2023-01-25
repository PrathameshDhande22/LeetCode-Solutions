class Solution2520:
    def countDigits(self, num: int) -> int:
        count = 0
        for i in range(len(str(num))):
            if num % int(str(num)[i]) == 0:
                count += 1
        return count

if __name__ == '__main__':
    ob = Solution2520()
    print(ob.countDigits(1248))
