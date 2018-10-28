a=int(input('Enter the 1st Number: '))
b=int(input('Enter the 2nd Number: '))
c=int(input('Enter the 3sd Number: '))
if(a>b):
    if(a>c):
        high=a
    else:
        high=c
else:
    if(b>c):
        high=b
    else:
        high=c
print('Highest=',high)        
    
    
