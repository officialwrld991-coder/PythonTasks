principal = input("Enter your principle: ")
rate = input("Enter your rate: ")
duration = input("Enter duration: ")

principal = float(principal)
rate = float(rate)
duration = float(duration)

print("Monthly payment is: ", principal * rate, * ((1 + rate) ** duration) / ((1 + rate) ** duration) -1)




