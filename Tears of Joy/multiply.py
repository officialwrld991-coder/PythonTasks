"""
1. initialize 7 outside the loop
2. set our loop to 13 so it counts from 0 to 12
3. add another variable inside the loop to multiply 7 by the loop count
4. then print result
"""

number = 7
for num in range(1, 13):
    multiply = num * number
    print(number, " X ",num, " = ", multiply)
