# https://www.acmicpc.net/problem/1920
from sys import stdin

n = int(stdin.readline().strip())
ns = set(map(int, stdin.readline().strip().split()))

m = int(stdin.readline().strip())
ms = list(map(int, stdin.readline().strip().split()))

for i in ms:
    if i in ns:
        print(1)
    else:
        print(0)
