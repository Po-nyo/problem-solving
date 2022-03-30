# https://www.acmicpc.net/problem/1259
from sys import stdin

while True:
    s = stdin.readline().strip()

    if s == '0':
        break

    rev = s[::-1]

    print('yes' if s == rev else 'no')
