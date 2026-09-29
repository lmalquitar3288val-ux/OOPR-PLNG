#1. string
txt = "Hello, Lance"
print(txt[5:7])
print(txt.upper())
name = "Python"
print(f"I frickin' love", name)

#2. boolean
print(10>9, 10==9, 10<9)

print(10>9, 10==9, bool("Hello"), bool(0))

#3. Operators
a = 15
b = 4
print(a%b, a//b, a**b)
a+=10
print(a)

#4. Lists
hehe=["apple", "pen", "pineapple", "apple"]
print(hehe)

hehe.append("orange")
print(hehe)

hehe.insert(2, "Dr. Sultana")
print(hehe)

hehe.remove("Dr. Sultana")
print(hehe)

hehe.pop(1)
print(hehe)

del hehe[3]
print(hehe)

#5. Loop
hi = ["Lance", "Martin", "Malquitar", "Dr. Sultana"]

for i in hi:
    print(i)

for i in range(len(hi)):
    print(hi[i])

#EXERCISE
colors = ["Red", "Green", "Blue"]
print(colors[0])
colors.remove("Green")
colors.insert(1, "Yellow")
colors.append("Purple")
colors.remove("Red")
print(colors)

#6. Tuples
hii=("apple", "pen", "pineapple")
print(hii)

hii="apple", "pen", "pineapple" #same as above
print(hii)
print(hii[-1])

hii="apple", "banana", "cherry", "orange", "kiwi", "melon", "mango"
print(hii[2:5])

#7. Conditions
#use of elif
a1=200
b1=33
if b1>a1:
    print("b is greater")
elif a1==b1:
    print("equal")
else:
    print("a is greater")

#EXERCISE
age=20
if age<13:
    print("Child")
elif age<18:
   print("Teen")
else:
    print("Adult")