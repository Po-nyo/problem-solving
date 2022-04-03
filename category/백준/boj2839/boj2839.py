# https://www.acmicpc.net/problem/2839
from sys import stdin

n = int(stdin.readline())

dp = [10000] * (n + 1)
dp[3] = 1
if len(dp) > 5:
    dp[5] = 1

for i in range(3, len(dp)):
    if dp[i] != 10000:
        if i + 3 <= len(dp) - 1:
            dp[i + 3] = min(dp[i + 3], dp[i] + 1)
        if i + 5 <= len(dp) - 1:
            dp[i + 5] = min(dp[i + 5], dp[i] + 1)

print(dp[n] if dp[n] != 10000 else -1)
