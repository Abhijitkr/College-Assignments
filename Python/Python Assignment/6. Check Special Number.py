n=int(input('Enter the Number: '))
temp=n
spec=0
while(temp>0):
    rem=temp%10
    f=1
    for i in range(1,rem+1):
        f=f*i
    spec=spec+f
    temp=temp//10
if(spec==n):
    print(n,'is a Special Number.')
else:
    print(n,'is not a Special Number.')
