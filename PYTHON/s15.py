d = {'a':'mike',2:'jhon',3:'franklin',4:'trevor'}

#nested for loop
for i in d.keys(), d.values():
    print('i=',i)
    for j in i:
        print('j=',j)
