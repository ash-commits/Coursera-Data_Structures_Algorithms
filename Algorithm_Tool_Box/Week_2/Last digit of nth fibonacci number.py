import time


def fib(n):
    a = 0
    b = 1
    if n == 0:
        return a
    elif n == 1:
        return b
    else:
        for i in range(2, n+1):
            c = (a+b) % 10
            a = b
            b = c
        return c


n = int(input())
print(fib(n))
#print(time.process_time())
