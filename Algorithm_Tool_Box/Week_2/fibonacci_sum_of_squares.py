f=[0,1]
last =[0,1]
for i in range(2,60):
    f.append(f[i-1]+f[i-2])
    last.append(int(str(f[i])[-1]))
n=int(input())
s= last[n%60] * last [n%60] + last[n%60] * last[(n-1)%60]
print(s%10)