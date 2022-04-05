# https://www.acmicpc.net/problem/1107
from sys import stdin

n = int(stdin.readline())
m = int(stdin.readline())

b_set = set()
if m > 0:
    b_set = set(stdin.readline().rstrip().split())

low = abs(n - 100)

for i in range(0, 1000000):
    str_i = str(i)
    for c in str_i:
        if c in b_set:
            break
    else:
        low = min(low, abs(n - i) + len(str_i))

print(low)
