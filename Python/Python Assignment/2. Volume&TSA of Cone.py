import math
r=float(input('Enter the Radius of the Cone: '))
h=float(input('Enter the Height of the Cone: '))
v=(1/3)*(22//7)*r*r*h
tsa=(22//7)*r*(r+math.sqrt(r*r+h*h))
print('The Volume of the Cone is ',v)
print('The Total Surface Area of the Cone is ',tsa)
