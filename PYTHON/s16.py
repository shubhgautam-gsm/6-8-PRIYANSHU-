d = {'a': 'mike', 2: 'jhon', 3: 'franklin', 4: 'trevor'}

# Printing all values
print("Names are:", d.values())

# Finding the key associated with the value 'mike'
key = None
userchoice=input("Please enter name(value) ")

for k, v in d.items():
    if v == userchoice:
        key = k
        break

print(f"The key for the value {userchoice} is: {key}")





