# https://www.acmicpc.net/problem/8958
from sys import stdin

for _ in range(int(stdin.readline())):
    answer = 0
    s = stdin.readline().strip()

    for e in s.split('X'):
        countO = e.count('O')
        answer += countO * (countO + 1) / 2

    print(int(answer))
