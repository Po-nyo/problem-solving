# https://www.acmicpc.net/problem/2869
from sys import stdin

a, b, v = map(int, stdin.readline().split())

day = (v - b) // (a - b)
if (v - b) % (a - b) > 0:
    day += 1

print(day)
