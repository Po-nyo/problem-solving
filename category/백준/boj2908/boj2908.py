# https://www.acmicpc.net/problem/2908
from sys import stdin

A, B = stdin.readline().split()

A = int(A[::-1])
B = int(B[::-1])

print(max(A, B))
