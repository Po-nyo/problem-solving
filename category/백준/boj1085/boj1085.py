# https://www.acmicpc.net/problem/1085
from sys import stdin

x, y, w, h = list(map(int, stdin.readline().split()))

print(min(x, w-x, y, h-y))
