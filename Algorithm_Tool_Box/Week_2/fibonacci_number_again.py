def pisanoPeriod(m):
    prev,curr = 0,1
    for i in range(m*m):
        prev,curr = curr , (prev+curr)%m
        if (prev == 0 and curr == 1):
            return i+1
def fib(n,m):
    pisano_period = pisanoPeriod(m)
    n = n % pisano_period
    a=0
    b=1
    if n==0:
        return a
    elif n==1:
        return b
    else:
        for i in range(2,n+1):
            a , b = b , a+b
        return (b % m)
a = [int(i) for i in input().split()]
print(fib(a[0],a[1]))