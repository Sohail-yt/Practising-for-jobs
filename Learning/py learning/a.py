T=int(input())
N=int(input())
for i in range(T):
    # for j in range(N):
    A=[int(x) for x in input().split()]
    B=[int(x) for x in input().split()]
    count=0
    k=0+A[0]
    if k<=B[0]:
        count+=1
    for j in range(1,N):
        if A[j]+1<=B[j]+1:
            count+=1
    print(count)