n=int(input('Enter the Number: '))
temp=n
s=0
while(temp>0):
    rem=temp%10
    s=s+rem
    temp=temp//10
    if(s>9 and temp==0):
        temp=s
        s=0
print('The Single Sum of',n,'is',s)        
