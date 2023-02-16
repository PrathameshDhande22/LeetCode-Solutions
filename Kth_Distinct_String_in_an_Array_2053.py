from collections import Counter
class Solution2053:

    def kthDistinct(self, arr: list[str], k: int) -> str:
        co = Counter(arr)
        index = 0
        print(co)
        for i in co:
            if co[i] == 1:
                index += 1
            if index == k:
                return i  
        return ""

    
if __name__ == "__main__":
    ob = Solution2053()
    arr = ["a", "b", "a"]
    print(ob.kthDistinct(arr, 3))
