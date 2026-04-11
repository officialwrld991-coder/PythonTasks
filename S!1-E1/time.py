seconds = input("enter time in seconds: ")
seconds = int (seconds)

hour = seconds // 3600
minute = (seconds // 3600) % 60
seconds = seconds % 60

print("the time is  ",  hour , "hours" , minute  , "minute" , seconds , "seconds")
