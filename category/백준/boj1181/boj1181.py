# https://www.acmicpc.net/problem/1181
from sys import stdin

n = int(stdin.readline())
words = set()

for _ in range(n):
    words.add(stdin.readline().strip())

words = list(words)
words.sort()
words.sort(key=lambda s: len(s))

for word in words:
    print(word)
