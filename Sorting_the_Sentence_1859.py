class Solution1859:
    def sortSentence(self, s: str) -> str:
        sentence = dict()
        answer = ""
        for words in s.split():
            sentence.__setitem__(words[len(words)-1], words[0:len(words)-1])
        index = list(sentence.keys())
        index.sort()
        for i in index:
            if(i==index[len(index)-1]):
                answer += sentence.get(i)
            else:
                answer += sentence.get(i)+" "
        return answer


if __name__ == '__main__':
    ob = Solution1859()
    s = "Myself2 Me1 I4 and3"
    print(ob.sortSentence(s))
