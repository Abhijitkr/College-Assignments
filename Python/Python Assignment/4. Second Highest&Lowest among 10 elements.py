for i in range(1,11):
    n=int(input('Enter the Number: '))
    if(i==1):
        h=l=n
    if(n>=h):
        sh=h
        h=n
    elif(n<=l):
        sl=l
        l=n
print('Second Highest: ',sh)
print('Second Lowest: ',sl)
    
