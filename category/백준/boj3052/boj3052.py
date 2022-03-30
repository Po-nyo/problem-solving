# https://www.acmicpc.net/problem/3052
from sys import stdin

remains = set()

for i in range(10):
    n = int(stdin.readline())
    remains.add(n % 42)

print(len(remains))
