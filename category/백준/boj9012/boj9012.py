# https://www.acmicpc.net/problem/9012
from sys import stdin
from collections import deque

t = int(stdin.readline())

for _ in range(t):
    s = stdin.readline().rstrip()
    dq = deque()
    ans = 'YES'
    for c in s:
        if c == '(':
            dq.appendleft(c)
        elif len(dq) == 0:
            ans = 'NO'
            break
        else:
            dq.popleft()
    if len(dq) > 0:
        ans = 'NO'
    print(ans)
