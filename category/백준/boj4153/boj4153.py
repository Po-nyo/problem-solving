# https://www.acmicpc.net/problem/4153
from sys import stdin

while True:
    abc = list(map(int, stdin.readline().split()))

    if sum(abc) == 0:
        break

    abc.sort()
    print('right' if abc[2]**2 == abc[0]**2 + abc[1]**2 else 'wrong')
