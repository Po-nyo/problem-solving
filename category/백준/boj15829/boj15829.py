# https://www.acmicpc.net/problem/15829
from sys import stdin

L = int(stdin.readline())
s = stdin.readline().rstrip()

hash_sum = 0
for i in range(len(s)):
    hash_sum += (ord(s[i]) - ord('a') + 1) * (31 ** i)

print(hash_sum % 1234567891)
