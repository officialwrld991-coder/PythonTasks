add = 0
product = 1
for number in range(4):
    user_input = int(input("Enter your Number: "))
    add += user_input
    product *= user_input
print("Your sum is: ", add)
print("Your product is: ", product)
average = add / 4
print("Your Average Value is: ", average)

