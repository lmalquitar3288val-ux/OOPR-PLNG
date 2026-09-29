print("Compute and Pay")
print("---------------")

item1 = float(input("Enter the cost of the first item: "))
item2 = float(input("Enter the cost of the second item: "))

totcost = item1 + item2

have = float(input("Enter your money: "))

if have >= totcost:
    change = have - totcost
    print("Thank you. Your change is:", change)
else:
    owe = totcost - have
    print("You are", .3%fowe, "behind. Please provide more money.")