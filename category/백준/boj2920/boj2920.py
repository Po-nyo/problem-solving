# https://www.acmicpc.net/problem/2920
from sys import stdin

s = stdin.readline().strip()

d = {"1 2 3 4 5 6 7 8": "ascending",
     "8 7 6 5 4 3 2 1": "descending"}

print(d.get(s, "mixed"))
