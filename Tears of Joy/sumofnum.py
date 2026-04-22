"""
1. initialize a variable outside the loop 
2. make it to zero
3. using a for loop with start at 0, end at 100
4. add the number with the initialized variable outside
5. print sum outside the loop
"""
count = 0

for number in range(101):
    count = number + count     
print(count)
