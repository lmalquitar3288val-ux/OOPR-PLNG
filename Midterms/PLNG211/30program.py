while True:
    print("\n==============================")
    print("      PYTHON PROGRAMS 1-20")
    print("==============================")
    print("1. Hello World")
    print("2. Greeting")
    print("3. Sum of Two Numbers")
    print("4. Average of Two Numbers")
    print("5. Weighted Average")
    print("6. Average of Three Exams")
    print("7. Passed or Failed")
    print("8. Even or Odd")
    print("9. Positive, Negative, or Zero")
    print("10. BMI Calculation")
    print("11. Driver's License Eligibility")
    print("12. Numbers 1-100")
    print("13. Even Numbers 1-100")
    print("14. Odd Numbers 1-100")
    print("15. Numbers Divisible by 3 or 5")
    print("16. Numbers up to User Input")
    print("17. Area and Perimeter")
    print("18. Display Characters")
    print("19. Sum of Numbers Between Two Numbers")
    print("20. Cinema/Theater Fee")
    print("0. Exit")
    print("==============================")

    choice = input("Enter your choice: ")

    if choice == "1":
        print("Hello, World")

    elif choice == "2":
        usertext = input("What is your name? ")
        print("Hello", usertext)

    elif choice == "3":
        num1 = input("Enter first number: ")
        num2 = input("Enter second number: ")
        total = float(num1) + float(num2)
        print("The sum of {0} and {1} is {2}".format(num1, num2, total))

    elif choice == "4":
        num1 = input("Enter first number: ")
        num2 = input("Enter second number: ")
        average = (float(num1) + float(num2)) / 2
        print("Average: {0}".format(average))

    elif choice == "5":
        visagrade = input("Enter your visa grade: ")
        finalgrade = input("Enter your final grade: ")
        average = (float(visagrade) * 0.3) + (float(finalgrade) * 0.7)
        print("Average: {0}".format(average))

    elif choice == "6":
        firstexam = input("Your first exam: ")
        secondexam = input("Your second exam: ")
        thirdexam = input("Your third exam: ")
        average = (float(firstexam) + float(secondexam) + float(thirdexam)) / 3
        print("Average: {0}".format(average))

    elif choice == "7":
        average = input("Enter average: ")
        if int(average) >= 50:
            print("Passed")
        else:
            print("Failed")

    elif choice == "8":
        num = int(input("Enter a number: "))
        if num % 2 == 0:
            print("{0} is Even".format(num))
        else:
            print("{0} is Odd".format(num))

    elif choice == "9":
        num = float(input("Enter a number: "))
        if num > 0:
            print("Positive number")
        elif num == 0:
            print("Zero")
        else:
            print("Negative number")

    elif choice == "10":
        print("Body Mass Index Calculation Program")
        height = float(input("Enter height (m): "))
        weight = float(input("Enter weight (kg): "))

        index = weight / (height * height)

        if index <= 18:
            print("Underweight BMI: {}".format(index))
        elif index <= 25:
            print("Normal BMI: {}".format(index))
        elif index <= 30:
            print("Obese BMI: {}".format(index))
        else:
            print("Severely Obese BMI: {}".format(index))

    elif choice == "11":
        age = input("Enter age: ")
        if int(age) < 18:
            print("Your Age Is Not Eligible To Get A Driver's License")
        else:
            print("Your Age Is Eligible To Get Your License")

    elif choice == "12":
        for i in range(1, 101):
            print(i)

    elif choice == "13":
        for i in range(1, 101):
            if i % 2 == 0:
                print(i)

    elif choice == "14":
        for i in range(1, 101):
            if i % 2 != 0:
                print(i)

    elif choice == "15":
        for i in range(1, 101):
            if i % 3 == 0 or i % 5 == 0:
                print(i)

    elif choice == "16":
        num = input("Enter number: ")
        for i in range(1, int(num) + 1):
            print(i)

    elif choice == "17":
        short = input("Enter short side: ")
        tall = input("Enter tall side: ")

        area = int(short) * int(tall)
        perimeter = 2 * (int(short) + int(tall))

        print("Area: {0}".format(area))
        print("Perimeter: {0}".format(perimeter))

    elif choice == "18":
        word = "mrhuseyin"
        for char in word:
            print(char)

    elif choice == "19":
        sumofnumbers = 0

        num1 = int(input("First number: "))
        num2 = int(input("Second number: "))

        for i in range(num1 + 1, num2):
            sumofnumbers += i

        print("Sum of numbers between {0} and {1}: {2}".format(
            num1, num2, sumofnumbers
        ))

    elif choice == "20":
        selection = input("Press (1) for Cinema, (2) for Theater: ")
        student = input("Are you a student (Y/N): ")

        price = 0

        if selection == "1":
            price = 10
        elif selection == "2":
            price = 5

        if student == "Y" or student == "y":
            price = price / 2

        print("The fee you have to pay: {}".format(price))

    elif choice == "0":
        print("Program ended.")
        break

    else:
        print("Invalid choice. Please try again.")