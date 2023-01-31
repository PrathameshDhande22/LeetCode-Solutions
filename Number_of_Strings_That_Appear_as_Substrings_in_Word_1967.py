class Solution1967:
    def numOfStrings(self, patterns: list[str], word: str) -> int:
        return len([pat for pat in patterns if pat in word])


if __name__ == '__main__':
    patterns = ["a", "a", "a"]
    word = "ab"
    ob = Solution1967()
    print(ob.numOfStrings(patterns, word))
