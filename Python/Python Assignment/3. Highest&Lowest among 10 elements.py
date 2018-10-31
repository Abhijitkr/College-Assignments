for i in range(1,11):
    n=int(input('Enter the Number: '))
    if(i==1):
        h=l=n
    if(n>=h):
        h=n
    elif(n<=l):
        l=n
print('Highest: ',h)
print('Lowest: ',l)
        
    
    
