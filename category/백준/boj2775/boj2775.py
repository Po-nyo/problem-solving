# https://www.acmicpc.net/problem/2775
from sys import stdin

T = int(stdin.readline())

for _ in range(T):
    k, n = int(stdin.readline()), int(stdin.readline())

    count = [[0 for i in range(n + 1)] for _ in range(k + 1)]
    for i in range(n + 1):
        count[0][i] = i

    for i in range(1, k + 1):
        for j in range(1, n + 1):
            count[i][j] = sum(count[i-1][1:j+1])

    print(count[k][n])
