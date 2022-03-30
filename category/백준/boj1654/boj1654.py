# https://www.acmicpc.net/problem/1654
from sys import stdin

k, n = list(map(int, stdin.readline().split()))

line_list = []

for _ in range(k):
    line_list.append(int(stdin.readline()))

high = max(line_list)
low = 1

while low <= high:
    mid = (low + high) // 2
    cnt = 0

    for i in line_list:
        cnt += i // mid

    if cnt >= n:
        low = mid + 1
    else:
        high = mid - 1

print(high)
