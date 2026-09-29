def lastword(word1, word2, word3):
    letter1 = word1[0:1].lower()
    letter2 = word2[0:1].lower()
    letter3 = word3[0:1].lower()

    if letter1 >= letter2 and letter1 >= letter3:
        return word1
    elif letter2 >= letter1 and letter2 >= letter3:
        return word2
    else:
        return word3

data1 = input("Enter the first word: ")
data2 = input("Enter the second word: ")
data3 = input("Enter the third word: ")

output = lastword(data1, data2, data3)
print("The word that comes last alphabetically is: ", output)