# Declaring and initializing an array (list)
arr = [10, 20, 30, 40, 50]

# Accessing elements
print(f"The first element is: {arr[0]}")

# Adding an element
arr.append(60)
print(f"Array after appending 60: {arr}")

# Inserting an element at a specific index
arr.insert(2, 25)
print(f"Array after inserting 25 at index 2: {arr}")

# Removing an element
arr.remove(30)
print(f"Array after removing 30: {arr}")

# Finding the length of the array
length = len(arr)
print(f"The length of the array is: {length}")

# Slicing the array
sliced_arr = arr[1:4]
print(f"Sliced array (from index 1 to 3): {sliced_arr}")
