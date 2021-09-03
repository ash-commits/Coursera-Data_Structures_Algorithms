def fib(n):
    a = 0
    b = 1
    if n == 0:
        return a
    elif n == 1:
        return b
    else:
        for i in range(2, n+1):
            c = a+b
            a = b
            b = c
        return b-1


a=int (input())
'''if len(a) == 1:
    print((fib(a[0]))%10)
else:'''
sums = 0
remainder = a % 60
if a <= 1:
    print(a)
elif remainder == 0:
    print(0)
else:
    print(fib(remainder+2)%10)
