def fibonacci(n):
    sequence = []
    a, b = 0, 1
    for _ in range(n):
        sequence.append(a)
        a, b = b, a + b
    return sequence

if __name__ == "__main__":
    try:
        n = int(input("How many Fibonacci numbers? "))
        if n < 0:
            raise ValueError("Number must be non-negative.")
        fib_seq = fibonacci(n)
        print("Fibonacci sequence:")
        print(", ".join(str(num) for num in fib_seq))
    except ValueError as e:
        print(f"Invalid input: {e}")

    input("Press Enter to exit...") 