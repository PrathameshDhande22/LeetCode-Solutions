class Solution844:
    def backspaceCompare(self, s: str, t: str) -> bool:
        return self.getString(s) == self.getString(t)

    def getString(self, s: str) -> str:
        backspace = list()
        for char in s:
            if char == "#":
                try:
                    backspace.pop()
                except IndexError:
                    pass
            else:
                backspace.append(char)
        return str().join(backspace)


if __name__ == '__main__':
    ob = Solution844()
    print(ob.backspaceCompare("a##c", "#a#c"))
