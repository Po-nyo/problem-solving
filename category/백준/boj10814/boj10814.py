# https://www.acmicpc.net/problem/10814
from sys import stdin

n = int(stdin.readline())

m_list = []
for _ in range(n):
    m_list.append(stdin.readline().strip().split())

m_list.sort(key=lambda x: int(x[0]))
for m in m_list:
    print(m[0], m[1])
