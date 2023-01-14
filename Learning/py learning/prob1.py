t=int(input())
for i in range(t):
    N=int(input())
    arr=[int(x) for x in input().split()]
    listt=list(arr)
    for j in range(len(arr)):
        if(len(listt)==1):
            flag=1
        else:
            for k in range(len(listt)):
                if(arr[j]==arr[j+1]):
                    listt.pop(j)
    print(len(listt))