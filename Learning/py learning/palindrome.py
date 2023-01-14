user_input=input("Enter a String") # Taking Input

reverse_string=user_input[::-1] #Reversing the string using slicing

if(user_input==reverse_string): #comparing string and reversed string
    print("Palindrome")
else:
    print("Not Palindrome")