# pair wise multiplication
'''import random
while(True):
    n= random.randint(1,2)
    a=[]
    result=1
    for i in range(n):
        p=random.randint(0,100)
        a.append(p)
    for i in range(n):
        for j in range(i+1,n):
                if (result<=a[i]*a[j]):
                    result=a[i]*a[j]
    print(result)'''
n = int(input())
a = []
result = 0
a = [int(i) for i in input().split()]
for i in range(n):
    for j in range(i+1,n):
            if (result<=a[i]*a[j]):
                result=a[i]*a[j]
print(result)
#a.sort()
'''largest = 0
second = 0
for i in range(len(a)):
    largest = max(largest, a[i])
for j in range(len(a)):
    if a[j] != largest:
        second = max(second, a[j])
print(largest)'''
#print(a[n-1]*a[n-2])
