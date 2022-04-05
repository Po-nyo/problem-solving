# https://www.acmicpc.net/problem/2609
from sys import stdin

a, b = list(map(int, stdin.readline().split()))

tmp_a = min(a, b)
tmp_b = max(a, b)

while tmp_b > 0:
    r = tmp_a % tmp_b
    tmp_a = tmp_b
    tmp_b = r

print(tmp_a)
print(a * b // tmp_a)
