name=input('Enter the Name: ')
unit=float(input('Enter Unit Consumed:'))
if(unit<=100):
    amt=unit*1.50
elif(unit<=300):
    amt=(100*1.50)+((unit-100)*2.50)
else:
    amt=(100*1.50)+(200*2.50)+((unit-300)*3.50)
amt=amt+50
print('Name: ',name)
print('Unit Consumed: ',unit)
print('Electric Bill: ',amt)
