using System;
using System.Collections.Generic;

class Program
{
    static List<int> Fibonacci(int n)
    {
        List<int> sequence = new List<int>();
        int a = 0, b = 1;

        for (int i = 0; i < n; i++)
        {
            sequence.Add(a);
            int temp = a;
            a = b;
            b = temp + b;
        }

        return sequence;
    }

    static void Main(string[] args)
    {
        Console.Write("How many Fibonacci numbers? ");
        string input = Console.ReadLine();

        try
        {
            int n = int.Parse(input.Trim());
            if (n < 0)
            {
                throw new ArgumentException("Number must be non-negative.");
            }

            List<int> fibSeq = Fibonacci(n);
            Console.WriteLine("Fibonacci sequence:");
            Console.WriteLine(string.Join(", ", fibSeq));
        }
        catch (FormatException)
        {
            Console.WriteLine("Invalid input: Please enter an integer.");
        }
        catch (ArgumentException e)
        {
            Console.WriteLine($"Invalid input: {e.Message}");
        }
        Console.WriteLine("Press any key to exit...");
        Console.ReadKey();
    }
}
