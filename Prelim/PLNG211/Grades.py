x = "YES"

while x == "YES" or x == "yes" or x == "Yes":
    oA, oB, oC, oF = 'A', 'B', 'C', 'F'

    print("STUDENT GRADE CALCULATOR")
    print("------------------------")
    grade1 = int(input("Enter your Java Programming score: "))
    grade2 = int(input("Enter your C Programming score: "))
    grade3 = int(input("Enter your Database Handling Score: "))

    sum1 = float(grade1 + grade2 + grade3)
    ave = float(sum1 / 3)

    if ave > 89 and ave < 101:
        print("Your computed grade is ", ave, "and your mark is ", oA)
    elif ave > 79 and ave < 90:
        print("Your computed grade is ", ave, "and your mark is ", oB)
    elif ave > 74 and ave < 80:
        print("Your computed grade is ", ave, "and your mark is ", oC)
    elif ave < 75:
        print("Your computed grade is ", ave, "and your mark is ", oF)
    else:
        print("Invalid Input!")
        break
    x = input("Do you want to continue? YES/NO: ")
    print("")

print("Program Terminated. Thank you!")
