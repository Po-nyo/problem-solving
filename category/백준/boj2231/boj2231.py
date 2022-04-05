# https://www.acmicpc.net/problem/2231
from sys import stdin

n = int(stdin.readline())
ans = -1

start = max(0, n - len(str(n)) * 9)

for i in range(start, n):
    result = sum([int(k) for k in list(str(i))]) + i

    if result == n:
        ans = i
        break

print(0 if ans == -1 else ans)
