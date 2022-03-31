# https://www.acmicpc.net/problem/1966
from sys import stdin
from collections import deque

t = int(stdin.readline().strip())

for _ in range(t):
    n, m = list(map(int, stdin.readline().strip().split()))
    cnt = 0

    priority = deque(map(int, stdin.readline().strip().split()))

    while priority:
        k = priority.popleft()
        m -= 1

        p_max = max(priority) if priority else 0

        if p_max > k:
            priority.append(k)
            if m == -1:
                m = len(priority) - 1
        else:
            cnt += 1

        if m == -1:
            break

    print(cnt)
