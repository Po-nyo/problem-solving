# https://www.acmicpc.net/problem/2798
from sys import stdin
import itertools

n, m = list(map(int, stdin.readline().split()))
n_list = list(map(int, stdin.readline().split()))

ans = 0

for card_set in itertools.combinations(n_list, 3):
    if sum(card_set) <= m:
        ans = max(ans, sum(card_set))

print(ans)
