# https://www.acmicpc.net/problem/18111
from sys import stdin
from collections import Counter

n, m, b = map(int, stdin.readline().split())

ground = []
for _ in range(n):
    ground.extend(list(map(int, stdin.readline().split())))

counter = Counter(ground)
low = min(counter.keys())
high = max(counter.keys())

ans_time = 256 * 500 * 500
ans_height = -1

for i in range(low, high + 1):
    x = 0   # 파내야 되는 블록
    y = 0   # 쌓아야 되는 블록

    for k in counter.keys():
        diff = (k - i) * counter[k]

        if diff >= 0:
            x += diff
        else:
            y -= diff

    if x + b < y:
        continue

    time = 2 * x + y
    if ans_time >= time:
        ans_time = time
        ans_height = i

print(ans_time, ans_height)
