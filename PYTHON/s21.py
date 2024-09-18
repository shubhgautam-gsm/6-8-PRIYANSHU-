# Recursive function to calculate factorial
def factorial(n):
    """Returns the factorial of a number."""
    if n == 1:
        return 1  # Base case
    else:
        return n * factorial(n - 1)  # Recursive case

# Calling the recursive function
print(f"Factorial of 5 is: {factorial(5)}")
