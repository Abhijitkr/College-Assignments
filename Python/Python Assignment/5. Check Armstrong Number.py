n=int(input('Enter the Number: '))
arm=0
temp=n
while(temp>0):
    rem=temp%10
    arm=arm+(rem*rem*rem)
    temp=temp//10
if(n==arm):
    print(n,'is an Armstrong Number.')
else:
    print(n,'is not an Armstrong Number.')
