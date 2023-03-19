class MyHashSet:

    def __init__(self):
        self.list = []

    def add(self, key: int) -> None:
        if key not in self.list:
            self.list.append(key)

    def remove(self, key: int) -> None:
        if key in self.list:
            self.list.remove(key)

    def contains(self, key: int) -> bool:
        return key in self.list

    def __str__(self) -> str:
        set = "{"
        for i in self.list:
            set += f"{i} ,"
        set += "}"
        return set


if __name__ == '__main__':
    myHashSet = MyHashSet()
    myHashSet.add(1)
    myHashSet.add(2)
    print(myHashSet)
    print(myHashSet.contains(1))
    print(myHashSet.contains(3))
    myHashSet.add(2)
    print(myHashSet)
    print(myHashSet.contains(2))
    myHashSet.remove(2)
    print(myHashSet)
    myHashSet.remove(6)
    print(myHashSet)
    print(myHashSet.contains(2))
