def binary(arr,ele,strt,end):
    mid=arr[0]+arr[-1]//2
    if mid==ele:
        print(arr[mid])
    else:
        if ele<arr[mid]:
            return binary(arr, ele,arr[0],arr[mid-1]) 
        else:
            return binary(arr, ele, arr[mid]+1, arr[-1])
arr=[int(x) for x in input("Enetr array").split()]
sorted(arr)
ele=int(input("Enetr elemet to find"))
binary(arr, ele,arr[0],arr[-1])
