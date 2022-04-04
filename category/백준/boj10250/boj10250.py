# https://www.acmicpc.net/problem/10250
from sys import stdin

t = int(stdin.readline())

for _ in range(t):
    h, w, n = map(int, stdin.readline().split())

    remain = n % h
    floor = remain if remain != 0 else h
    floor *= 100
    number = n // h + 1 if remain != 0 else n // h

    print(floor + number)
