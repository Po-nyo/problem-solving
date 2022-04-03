# https://www.acmicpc.net/problem/2805
from sys import stdin

n, m = map(int, stdin.readline().split())
trees = list(map(int, stdin.readline().split()))

low = 0
high = max(trees)

while low <= high:
    mid = (low + high) // 2
    total = 0
    for i in trees:
        if i >= mid:
            total += i - mid
    if total >= m:
        low = mid + 1
    elif total < m:
        high = mid - 1

print(high)
