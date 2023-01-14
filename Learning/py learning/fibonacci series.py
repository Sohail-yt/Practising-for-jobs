def odd_eve(ui):
    if(ui<0):
        return -1
    else:
        for i in range(1,ui):
            if(ui%2==0):
                return 0

ui=int(input())
print(odd_eve(ui))