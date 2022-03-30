# https://www.acmicpc.net/problem/2577
from sys import stdin

A = int(stdin.readline())
B = int(stdin.readline())
C = int(stdin.readline())

multiple = str(A * B * C)
cnt = []

for i in range(0, 10):
    cnt.append(multiple.count(str(i)))

for i in cnt:
    print(i)
