# https://www.acmicpc.net/problem/4949
from sys import stdin
from collections import deque
import re

while True:
    s = stdin.readline().rstrip()

    if s == '.':
        break

    s = re.sub('[^\\[(\\])]', '', s)

    ans = 'yes'
    dq = deque()
    for c in s:
        if c == '(' or c == '[':
            dq.appendleft(c)
        elif c == ')':
            if len(dq) == 0 or dq.popleft() != '(':
                ans = 'no'
                break
        else:
            if len(dq) == 0 or dq.popleft() != '[':
                ans = 'no'
                break

    if len(dq) > 0:
        ans = 'no'
    print(ans)
