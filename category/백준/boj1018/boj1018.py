# https://www.acmicpc.net/problem/1018
from sys import stdin

n, m = list(map(int, stdin.readline().split(' ')))

board = []

for _ in range(n):
    board.append(stdin.readline().strip())

char_list = ['W', 'B']

answer = 64
for x in range(n-7):
    for y in range(m-7):
        cnt1 = 0
        cnt2 = 0
        for i in range(x, x+8):
            for j in range(y, y+8):
                if board[i][j] == char_list[(i + j) % 2]:
                    cnt1 += 1
                else:
                    cnt2 += 1
        answer = min(answer, cnt1, cnt2)

print(answer)
