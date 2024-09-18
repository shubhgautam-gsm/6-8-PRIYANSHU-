d = {'a': 'mike', 2: 'jhon', 3: 'franklin', 4: 'trevor'}

# Printing all values
print("Names are:", d.values())

# Finding the key associated with the value 'mike'
key = None
for k, v in d.items():
    if v == 'mike':
        key = k
        break

print(f"The key for the value 'mike' is: {key}")
