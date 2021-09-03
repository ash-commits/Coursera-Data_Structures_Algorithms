def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)


def lcm(a, b):
    return int((a/gcd(a, b))*b)


a = [int(i) for i in input().split()]
print(lcm(a[0], a[1]))
