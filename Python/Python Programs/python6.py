for i in range(1,8):
    for j in range(1,8-i):
        print("  ",end='')
    for k in range(i,2*i):
        print(k%10,"",end='')
    for l in range(2*i-2,i-1,-1):
        print(l%10,"",end='')
    print()    
    
    
