def prime(user_input):
    if(user_input==1):
        return "not prime"
    else:
        for i in range(2,user_input):
            if(user_input%i==0):
                return "not prime"
            else:
                return "prime"
user_input=1
print(prime(user_input))