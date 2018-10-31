for n in range(2,1001):
    flag=0
    for i in range(2,n//2+1):
        if(n%i==0):
            flag=flag+1
    if(flag==0):
        print(n)



    

