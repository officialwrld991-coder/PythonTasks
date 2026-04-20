
count = 0
user_input = int(input("Enter your number: "))

while (user_input != 1 and user_input != 2):
    count += 1
    print("Your count is: ", count)
    user_input = int(input("Enter your number: "))
print("Your count number is: ", count)
