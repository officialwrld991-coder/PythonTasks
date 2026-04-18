'''
collect your customer's spending score using input,
using the conditional statment:

if customer's spending score is between # 1,000 to # 10,000, multiply by 0.5.
if customer's spending score is between # 10,000 to # 50,000, multiply by 0.1.
if customer's spending score is above # 50,000, multiply by 0.2
'''

customer_spending = input("Enter your Spending total: ")
customer_spending = int(customer_spending)

if (customer_spending >= 1000 and customer_spending <= 10000):
    new_value = (int(customer_spending * (5/100)))
    print("your discounted price is: ", new_value)

elif (customer_spending >= 10000 or customer_spending <= 50000):
    next_value = (int(customer_spending * (10/100)))
    print("your discounted price is: ", next_value)

elif (customer_spending >= 50000):
    greater_value = (int(customer_spending * (20/100)))
    print("your discounted price is: ", greater_value)


