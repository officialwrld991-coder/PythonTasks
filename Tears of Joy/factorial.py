
user_input = int(input("Enter your Number: "))

multiply = 1

for number in range(user_input, 0, -1):
    multiply *= number 
       
print("The sum of factorial of ", user_input, " is ", multiply) 
