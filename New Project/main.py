# Program that Loops through a self created list
# Adding your numbers to the end of the list
# And averaging once you call 'break'

firstList = list()
while True:
    user_input = raw_input("Enter a number")
    if user_input == 'break':break
    number = float(user_input)
    firstList.append(number)

print "Total equals:",sum(firstList)
print "Average equals:",sum(firstList)/len(firstList)
