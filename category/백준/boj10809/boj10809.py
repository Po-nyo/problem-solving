# https://www.acmicpc.net/problem/10809
from sys import stdin

s = stdin.readline().strip()
ans_list = []

for i in range(ord('z') - ord('a') + 1):
    ans_list.append(s.find(chr(ord('a') + i)))

for i in ans_list:
    print(i, end=' ')
