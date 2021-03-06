# https://www.acmicpc.net/problem/2164
from sys import stdin
from collections import deque

n = int(stdin.readline().strip())

dq = deque([i for i in range(1, n+1)])

while len(dq) > 1:
    dq.popleft()
    dq.append(dq.popleft())

print(dq.popleft())
