class Solution2114:
    def mostWordsFound(self, sentences: list[str]) -> int:
        words = list()
        for sen in sentences:
            words.append(sen.split(" ").__len__())
        return max(words)


if __name__ == '__main__':
    ob = Solution2114()
    sentences = ["please wait", "continue to fight", "continue to 'hello' win"]
    print(ob.mostWordsFound(sentences=sentences))
