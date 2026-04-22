"""
1. using a for loop with start at 2, end at 20 and two steps forward
2. add end="  " to overide the default next line input on python
"""

for number in range(2, 22, 2):
    if number % 2 == 0:
        print(number, end="  ")
print()
