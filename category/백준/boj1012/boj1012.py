# https://www.acmicpc.net/problem/1012
from sys import stdin
from collections import deque

t = int(stdin.readline())

for _ in range(t):
    m, n, k = map(int, stdin.readline().rstrip().split())
    ground = [[0 for _ in range(n)] for _ in range(m)]
    visited = [[0 for _ in range(n)] for _ in range(m)]
    count = 0

    for _ in range(k):
        x, y = map(int, stdin.readline().rstrip().split())
        ground[x][y] = 1

    for x in range(len(ground)):
        for y in range(len(ground[x])):
            if ground[x][y] == 1 and visited[x][y] == 0:
                count += 1
                dq = deque()
                dq.append([x, y])
                visited[x][y] = 1

                while len(dq) > 0:
                    cx, cy = dq.pop()
                    steps = [[-1, 0], [1, 0], [0, -1], [0, 1]]

                    for step in steps:
                        nx = cx + step[0]
                        ny = cy + step[1]

                        if 0 <= nx < len(ground) and 0 <= ny < len(ground[x]):
                            if ground[nx][ny] == 1 and visited[nx][ny] == 0:
                                dq.append([nx, ny])
                                visited[nx][ny] = 1

    print(count)
