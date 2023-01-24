class Solution1678:
    def interpret(self, command: str) -> str:
        return command.replace("()", "o").replace("(al)", "al")


if __name__ == '__main__':
    ob = Solution1678()
    print(ob.interpret("(al)G(al)()()G"))
