# https://www.acmicpc.net/problem/2675
from sys import stdin

T = int(stdin.readline())

for i in range(T):
    n, s = stdin.readline().split()

    for c in s:
        print(c * int(n), end='')
    print()
