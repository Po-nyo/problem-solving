# https://www.acmicpc.net/problem/2108
from sys import stdin
from collections import Counter

n = int(stdin.readline().strip())
n_list = []

for _ in range(n):
    n_list.append(int(stdin.readline().strip()))

n_list.sort()
count = Counter(n_list).most_common(2)

print(round(sum(n_list) / n))
print(n_list[int(len(n_list)/2)])
print(count[0][0] if len(count) == 1 or count[0][1] != count[1][1] else count[1][0])
print(n_list[-1] - n_list[0])
