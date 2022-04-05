# https://www.acmicpc.net/problem/1074
from sys import stdin


def rec(x, y, size):
    global r
    global c

    if size == 1:
        return 0

    size //= 2
    count = 0
    for i in range(1, 3):
        for j in range(1, 3):
            if x+size*(i-1) <= r < x+(size*i) and y+size*(j-1) <= c < y+(size*j):
                return count * size ** 2 + rec(x+size*(i-1), y+size*(j-1), size)
            count += 1


n, r, c = map(int, stdin.readline().rstrip().split())
print(rec(0, 0, 2 ** n))
