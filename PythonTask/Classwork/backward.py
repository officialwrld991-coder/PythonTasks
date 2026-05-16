"""
collect your input
print your your input
divide
"""

user_input = int(input("Enter your Number: "))
print(user_input)   
while user_input > 0:
    remainder = int(user_input / 10)
    print(remainder)
    divided = int(user_input / 10)
    user_input = divided
