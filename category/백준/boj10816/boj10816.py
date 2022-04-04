# https://www.acmicpc.net/problem/10816
from sys import stdin
from collections import Counter

n = int(stdin.readline())
n_list = stdin.readline().split()

counter = Counter(n_list)

m = int(stdin.readline())
m_list = stdin.readline().split()

for i in m_list:
    print(counter[i], end=' ')
