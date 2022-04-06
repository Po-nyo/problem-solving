# https://www.acmicpc.net/problem/1260
from sys import stdin
from collections import deque

n, m, v = map(int, stdin.readline().split())

graph = [[0 for _ in range(n + 1)] for _ in range(n + 1)]
visited = [False] * (n + 1)
for _ in range(m):
    x, y = map(int, stdin.readline().split())
    graph[x][y] = graph[y][x] = 1

dq = deque()
# === DFS === #
dq.append(v)
visited[v] = True
print(v, end=' ')

while dq:
    cv = dq.pop()

    for i in range(1, len(graph)):
        if graph[cv][i] == 1 and not visited[i]:
            dq.append(cv)
            dq.append(i)
            visited[i] = True
            print(i, end=' ')
            break
# === BFS === #
visited = [False] * (n + 1)
dq.append(v)
visited[v] = True
print()

while dq:
    cv = dq.popleft()
    print(cv, end=' ')

    for i in range(1, len(graph)):
        if graph[cv][i] == 1 and not visited[i]:
            dq.append(i)
            visited[i] = True
