# https://www.acmicpc.net/problem/7568
from sys import stdin

n = int(stdin.readline())
n_list = [list(map(int, stdin.readline().split())) for _ in range(n)]

for x, y in n_list:
    cnt = 1
    for x2, y2 in n_list:
        if x < x2 and y < y2:
            cnt += 1
    print(cnt, end=' ')
