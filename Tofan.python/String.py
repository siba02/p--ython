s=input("enter the string")
print(len(s))
if len(s)>=2:
    s1=s[:2]+s[-2:] # if string is greater than or equal to 2 print the string consist of first and list two characters
    print(s1)
print(s[0:len(s):2])
s.replace(" ","_")
print(s)
