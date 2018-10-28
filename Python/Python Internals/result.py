name=input('Enter the Name: ')
m1=int(input('Enter the Mark 1 : '))
m2=int(input('Enter the Mark 2 : '))
m3=int(input('Enter the Mark 3 : '))
total=m1+m2+m3
avg=(m1+m2+m3)/3
if(avg>=60):
    grade='First'
elif(avg>=50):
    grade='Second'
elif(avg>=40):
    grade='Third'
else:
    grade='Fail'
print('Name: ',name)
print('Marks 1 : ',m1)
print('Marks 2 : ',m2)
print('Marks 3 : ',m3)
print('Total : ',total)
print('Average : ',avg)
print('Grade : ',grade)


