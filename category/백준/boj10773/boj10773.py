# https://www.acmicpc.net/problem/10773

from sys import stdin
from collections import deque

k = int(stdin.readline())

dq = deque()
for _ in range(k):
    n = int(stdin.readline())

    if n == 0:
        dq.pop()
    else:
        dq.append(n)

print(sum(dq))
