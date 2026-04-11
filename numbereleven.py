number_one = input("enter your first number: ")
number_two = input("enter your second number: ")
number_three = input("enter your third number: ")
number_one = int(number_one)
number_two = int(number_two)
number_three = int(number_three)


add = (number_one + number_two + number_three)
average = (number_one + number_two + number_three) / 3
average = int (average)
multiple = (number_one * number_two * number_three)

print("The sum is:  ", add)

print("The average is: ", average)

print("The multiplication is: ", multiple)

largest = number_one
if(number_two > largest):
    number_two = largest

if(number_three > largest):
    number_three = largest

print("Largest Number is: ", largest)
smallest = number_one
if(number_two < smallest):
    number_two = smallest

if(number_three > smallest):
    number_three = largest

print("mallest Number is: ", smallest)
