# https://www.acmicpc.net/problem/1436
from sys import stdin

n = int(stdin.readline())

number = 666
count = 0

while count < n:
    if '666' in str(number):
        count += 1
    number += 1

print(number - 1)
