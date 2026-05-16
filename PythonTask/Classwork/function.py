def largest_number(number_one, number_two, number_three):
    largest = number_one
    if number_two > largest:
        largest = number_two
    elif number_three > largest:
        largest = number_three
    return largest
print (largest_number(3007,908,564))
#print (largest_number(number_three = 20, number_two = 2022,number_one = 556))
