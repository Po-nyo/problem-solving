# https://www.acmicpc.net/problem/1546
from sys import stdin

n = int(stdin.readline())
score = list(map(int, stdin.readline().split()))

max_score = max(score)

sum = 0
for i in score:
    sum += i/max_score * 100

print(sum / n)
