choice=int(input("Enter:-\n1. For Addition\n2. For Subtraction\n3. For Multiplication\n4. For Division\n"))
if(choice>=1 and choice<=4):
    num1=int(input("Enter the 1st Number: "))
    num2=int(input("Enter the 2nd Number: "))
    if(choice==1):
        print(num1,"+",num2,"=",num1+num2)
    elif(choice==2):
        print(num1,"-",num2,"=",num1-num2)
    elif(choice==3):
        print(num1,"*",num2,"=",num1*num2)
    elif(choice==4):
        print(num1,"/",num2,"=",num1/num2)
else:
    print("Invalid Choice!!")
    
    
