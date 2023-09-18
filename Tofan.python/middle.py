def is_prime(n):
    if n <= 1:
        return False
    if n <= 3:
        return True
    if n % 2 == 0 or n % 3 == 0:
        return False
    i = 5
    while i * i <= n:
        if n % i == 0 or n % (i + 2) == 0:
            return False
        i += 6
    return True

number = int(input("Enter a 3-digit number: "))

if 100 <= number <= 999:
    middle_digit = (number // 10) % 10
    
    if is_prime(middle_digit):
        print(f"The middle digit {middle_digit} is a prime number.")
    else:
        print(f"The middle digit {middle_digit} is not a prime number.")
else:
    print("Please enter a valid 3-digit number.")

