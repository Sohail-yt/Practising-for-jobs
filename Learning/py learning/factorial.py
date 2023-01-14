def fibo(user):
    n1=0
    n2=1
    temp=0
    if(user<=0):
        return 1
    else:
        for i in range(0,user):
            n1=n2
            n2=temp
            temp=n1+n2
            print(temp,end=" ")
user=5
fibo(user)
