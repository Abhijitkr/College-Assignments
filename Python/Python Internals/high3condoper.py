a=int(input('Enter the 1st Number: '))
b=int(input('Enter the 2nd Number: '))
c=int(input('Enter the 3sd Number: '))
high=a if(a>b and a>c) else b if(b>c) else c
print('Highest=',high)
      
