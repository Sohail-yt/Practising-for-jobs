n=int(input())
n1=0
n2=1
temp=0
if n==0:
    print("error")
else:
    for i in range(0,n):
        n1=n2
        n2=temp
        temp=n1+n2
        print(temp,end=" ")