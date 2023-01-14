u_in=input("Enter a number to cheq its armstrong or not")
conv_list=list(u_in) #converting to list
a=0
for i in range(0,len(conv_list)):
        a=conv_list[i]*len(conv_list) #we shoud add this 
        #error
if(a==u_in):
    print("arm")
else:
    print("not arm")