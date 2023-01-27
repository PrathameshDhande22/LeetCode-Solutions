class Solution1662:
    def arrayStringsAreEqual(self, word1: list[str], word2: list[str]) -> bool:
        return "".join(word1) == "".join(word2)


if __name__ == '__main__':
    ob = Solution1662()
    word1 = ["abc", "d", "defg"]
    word2 = ["abcddefg"]
    print(ob.arrayStringsAreEqual(word1, word2))
