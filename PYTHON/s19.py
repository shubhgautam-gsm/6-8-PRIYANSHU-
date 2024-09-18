# String Operations in Python

# Declaring and initializing a string
my_string = "Hello, World!, mukesh"

# Accessing the first character
print(f"The first character is: {my_string[0]}")

# Slicing the string
sliced_string = my_string[7:12]
print(f"Sliced string (from index 7 to 11): {sliced_string}")

# Getting the length of the string
length = len(my_string)
print(f"The length of the string is: {length}")

# Converting the string to uppercase
upper_string = my_string.upper()
print(f"String in uppercase: {upper_string}")

# Replacing "World" with "Python"
replaced_string = my_string.replace("World", "Python")
print(f"String after replacement: {replaced_string}")

# Splitting the string by ", "
split_string1 = my_string.split(", ")
print(f"String after splitting: {split_string1}")
split_string2 = my_string.split("o")
print(f"String after splitting: {split_string2}")
print(f"String after splitting: {split_string2[1]}")