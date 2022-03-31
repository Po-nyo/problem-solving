# https://www.acmicpc.net/problem/1874
from sys import stdin
from collections import deque

n = int(stdin.readline().strip())

dq = deque()
num = 1
answer = []

for _ in range(n):
    k = int(stdin.readline().strip())

    while k >= num:
        dq.appendleft(num)
        num += 1
        answer.append('+')

    if dq[0] != k:
        answer = ['NO']
        break

    dq.popleft()
    answer.append('-')

print('\n'.join(answer))
