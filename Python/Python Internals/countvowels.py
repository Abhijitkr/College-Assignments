str=input('Enter the String: ')
vowels=0
consonants=0
special_characters=0
digits=0
for i in range(0,len(str)):
    ch=str[i]
    if(ch>='a' and ch<='z') or (ch>='A' and ch<='Z'):
        ch=ch.lower()
        if(ch=='a' or ch=='e' or ch=='i' or ch=='o' or ch=='u'):
            vowels+=1
        else:
            consonants+=1
    elif(ch>='0' and ch<='9'):
        digits+=1
    else:
        special_characters+=1
print('Vowels=',vowels)
print('Consonants=',consonants)
print('Digits=',digits)
print('Special Characters=',special_characters) 

        
