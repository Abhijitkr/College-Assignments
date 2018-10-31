for n in range(1,1001):
    perf=0
    for i in range(1,n):
        if(n%i==0):
            perf=perf+i
    if(perf==n):
        print(n)
    
