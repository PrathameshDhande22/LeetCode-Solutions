class Solution1672:
    def maximumWealth(self, accounts: list[list[int]]) -> int:
        wealth = list()
        for l in accounts:
            wealth.append(sum(l))
        return max(wealth)


if __name__ == '__main__':
    ob = Solution1672()
    print(ob.maximumWealth([[2,8,7],[7,1,3],[1,9,5]]))
