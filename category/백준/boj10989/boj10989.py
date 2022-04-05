# https://www.acmicpc.net/problem/10989
from sys import stdin

n = int(stdin.readline())
counter = [0] * 10001

for _ in range(n):
    k = int(stdin.readline())
    counter[k] += 1

for i in range(1, len(counter)):
    for _ in range(counter[i]):
        print(i)
