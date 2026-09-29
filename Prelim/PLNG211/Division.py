x = True

print("Multipes of 5")
print("-------------")

while x == True:
    num = int(input("Enter a number that is multiple of 5 between 1-100: "))

    if num < 1 or num > 100 or num % 5 != 0:
        print("Invalid number. Try again.")
        continue

    elif num <= 100 and num >= 1:
        if num % 5 == 0:
            print("Number is valid. Good job")
            break
