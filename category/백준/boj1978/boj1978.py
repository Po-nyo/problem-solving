# https://www.acmicpc.net/problem/1978
from sys import stdin

n = int(stdin.readline().strip())
n_list = list(map(int, stdin.readline().strip().split()))

is_prime = [True] * 1001
is_prime[1] = False

for i in range(2, int(1000 ** 0.5) + 1):
    if is_prime[i]:
        for j in range(2, (1000 // i) + 1):
            is_prime[i * j] = False

cnt = 0
for i in n_list:
    if is_prime[i]:
        cnt += 1

print(cnt)
