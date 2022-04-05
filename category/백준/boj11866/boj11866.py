# https://www.acmicpc.net/problem/11866
from sys import stdin

n, k = map(int, stdin.readline().split())

seq = [str(i) for i in range(1, n+1)]
out_seq = []
i = k - 1
while True:
    out_seq.append(seq.pop(i))
    if len(seq) == 0:
        break
    i = (i + k - 1) % len(seq)

print('<', end='')
print(', '.join(out_seq), end='')
print('>', end='')
