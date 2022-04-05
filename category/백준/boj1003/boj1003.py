# https://www.acmicpc.net/problem/1003
from sys import stdin

t = int(stdin.readline())
dp_0 = [1, 0]
dp_1 = [0, 1]
for _ in range(t):
    n = int(stdin.readline())

    if len(dp_0) < n + 1:
        for i in range(len(dp_0), n + 1):
            dp_0.append(dp_0[i-1] + dp_0[i-2])

    if len(dp_1) < n + 1:
        for i in range(len(dp_1), n + 1):
            dp_1.append(dp_1[i-1] + dp_1[i-2])

    print(dp_0[n], dp_1[n])
