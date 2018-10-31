nm=input("Enter the Name: ")
unit=float(input("Enter the Unit Consumed: "))
if(unit<=100):
    bill=unit*1
elif(unit<=200):
    bill=100*1+(unit-100)*1.75
elif(unit>200):
    bill=100*1+100*1.75+(unit-200)*3
print("The total bill amoun is ",bill)    
    
