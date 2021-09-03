def fib(n):
    a = 0
    b = 1
    if n == 0:
        return 0
    if n == 1:
        return 1
    else:
        remainder = n % 60
        if remainder == 0:
            return 0
        for i in range(2, remainder+3):
            c = (a+b) % 60
            a = b
            b = c
        sums = b-1
        return sums


a = [int(i) for i in input().split()]
final = fib(a[1]) - fib(a[0]-1)
print(final % 10)
