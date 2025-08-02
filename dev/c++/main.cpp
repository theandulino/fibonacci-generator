#include <iostream>
#include <vector>
#include <stdexcept>

std::vector<int> fibonacci(int n) {
    std::vector<int> sequence;
    int a = 0, b = 1;
    for (int i = 0; i < n; ++i) {
        sequence.push_back(a);
        int next = a + b;
        a = b;
        b = next;
    }
    return sequence;
}

int main() {
    try {
        std::cout << "How many Fibonacci numbers? ";
        int n;
        std::cin >> n;

        if (n < 0) {
            throw std::invalid_argument("Number must be non-negative.");
        }

        std::vector<int> fib_seq = fibonacci(n);
        std::cout << "Fibonacci sequence:" << std::endl;
        for (size_t i = 0; i < fib_seq.size(); ++i) {
            std::cout << fib_seq[i];
            if (i != fib_seq.size() - 1) {
                std::cout << ", ";
            }
        }
        std::cout << std::endl;
    } catch (const std::invalid_argument& e) {
        std::cerr << "Invalid input: " << e.what() << std::endl;
    }

    return 0;
}
