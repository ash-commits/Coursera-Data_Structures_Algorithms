def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)


a = [int(i) for i in input().split()]
print(gcd(a[0], a[1]))
