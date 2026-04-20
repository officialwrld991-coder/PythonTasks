"""
1.  collect number from user using input
2.  using for loop count number from 1 to 10
3.  multiply user input with the number of recent count
4.  print your result
"""

user_number = int(input("Enter your Number: " ))


for number in range(1,11):
    product = number * user_number
    print( user_number, " X ", number, "= ",product)
    number+1

