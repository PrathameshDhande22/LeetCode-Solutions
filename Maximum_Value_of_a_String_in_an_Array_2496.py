import math


class Solution2496:

    def maximumValue(self, strs: list[str]) -> int:
        maximum = -1;
        for s in strs:
            if s.isdigit():
                curren = int(s)
            else:
                curren = len(s)
            maximum = max(curren, maximum)
        return maximum;
    

if __name__ == "__main__":
    strs = ["1", "01", "001", "0001"]
    ob = Solution2496()
    print(ob.maximumValue(strs))
