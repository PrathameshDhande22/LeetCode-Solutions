class Solution1455:

    def isPrefixOfWord(self, sentence: str, searchWord: str) -> int:
        sentence = sentence.split(" ")
        for index, words in enumerate(sentence):
            if words.startswith(searchWord):
                return index + 1
        return -1

    
if __name__ == "__main__":
    ob = Solution1455()
    sentence = "i love eating burger"
    searchword = "burg"
    print(ob.isPrefixOfWord(sentence, searchword))
