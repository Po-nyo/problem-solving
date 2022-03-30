# https://www.acmicpc.net/problem/2475
from sys import stdin

nums = list(map(int, stdin.readline().split()))

sum = 0

for i in nums:
    sum += i ** 2

print(sum % 10)
