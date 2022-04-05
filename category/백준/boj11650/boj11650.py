# https://www.acmicpc.net/problem/11650
from sys import stdin

n = int(stdin.readline())

p_list = []
for _ in range(n):
    p_list.append(list(map(int, stdin.readline().split())))

p_list.sort(key=lambda e: e[1])
p_list.sort(key=lambda e: e[0])

for x, y in p_list:
    print(x, y)
