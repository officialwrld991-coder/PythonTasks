"""
1. collect user input fron user
2. cast it to an integer
3. set a sentinel loop for when your user input is less than zero and terminates when it is greater than zero
4. then print your positive number
"""
user_input = int(input("Enter your Number: "))

while user_input < 0:
    print(user_input)
    user_input = int(input("Enter your Number: "))
    
print("Your positive Number is: ", user_input) 
