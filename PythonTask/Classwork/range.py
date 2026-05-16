mult = """

                  MULTIPLICATION TABLE
    """
print(mult)

for number in range(1, 10):
    print(number, " |", end="\t")
    for multiply in range(1,10):
        add = number * multiply
        print(add,  end="\t")
    print()

    
