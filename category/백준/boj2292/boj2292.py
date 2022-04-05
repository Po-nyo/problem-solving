# https://www.acmicpc.net/problem/2292
from sys import stdin

n = int(stdin.readline())

cnt = 1
k = 1
plus = 6

while k < n:
    cnt += 1
    k += plus * (cnt - 1)

print(cnt)
