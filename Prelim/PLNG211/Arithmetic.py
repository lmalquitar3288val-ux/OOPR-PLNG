x = "YES"

while x == "YES" or x == "yes" or x == "Yes":
    print("ARITHMETIC CALCULATOR")
    print("---------------------")
    print("Operations:")
    print("1. Addition    2. Subtraction    3. Multiplication")
    print("4. Division    5. Modulo         6. Increment")
    print("7. Decrement")
    choice = int(input("Choose an arithmetic (1-7): "))

    match choice:
        case 1:
            num1 = int(input("Enter the first number: "))
            num2 = int(input("Enter the second number: "))
            sumO = num1 + num2
            print("The computed value is:", sumO)
        case 2:
            num1 = int(input("Enter the first number: "))
            num2 = int(input("Enter the second number: "))
            diff = num1 - num2
            print("The computed value is:", diff)
        case 3:
            num1 = int(input("Enter the first number: "))
            num2 = int(input("Enter the second number: "))
            prod = num1 * num2
            print("The computed value is:", prod)
        case 4:
            num1 = int(input("Enter the first number: "))
            num2 = int(input("Enter the second number: "))
            quot = num1 / num2
            print("The computed value is:", quot)
        case 5:
            num1 = int(input("Enter the first number: "))
            num2 = int(input("Enter the second number: "))
            rem = num1 % num2
            print("The computed value is:", rem)
        case 6:
            num1 = int(input("Enter the number: "))
            preInc = num1 + 1
            print("The computed value is:", preInc)
        case 7:
            num1 = int(input("Enter the number: "))
            preDec = num1 - 1
            print("The computed value is:", preDec)
        case _:
            print("Invalid Input!")
            break

    x = input("Do you want to continue? YES/NO: ")
    print("")
print("Program Terminated. Thank you")

