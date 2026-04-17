'''
collect password input form user
cast it to variable len()
using the conditional statement,

if the password input is less than four it should show very weak
if the password input is less than eight it should show weak
if the password input is less than sixteen it should show strong
else it should show very strong

'''

password = input("what is your password: ")
password = len(password)

if (password <= 8):
    print("Very Weak")

elif (password <= 16):
    print("Strong")

else :
    print("Very Strong")


