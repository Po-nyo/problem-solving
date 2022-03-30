# https://www.acmicpc.net/problem/1157
from sys import stdin

word = stdin.readline().upper().strip()

count = []

for i in range(0, ord('Z') - ord('A') + 1):
    count.append(word.count(chr(i + ord('A'))))

max_value = max(count)

print('?' if count.count(max_value) > 1 else chr(count.index(max_value) + ord('A')))
