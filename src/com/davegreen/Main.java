package com.davegreen;

public class Main
{

    public static void main(String[] args) {

        // Inefficient way of testing multiple values.

        System.out.println("10'000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10'000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10'000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10'000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        System.out.println("##############################");

        // Structure of a for loop (or for statement)
        // for (initialize, termination, increment)

        for (int i = 0; i < 5; i++) {
            System.out.println("This is loop number " + i);
        }

        System.out.println("You have now exited the for loop");

        System.out.println("##############################");

        // Challenge 1

        for (double i = 2; i < 9; i++) {
            System.out.println("10'000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("##############################");

        // Challenge 2

        for (double i = 8; i > 1; i--) {
            System.out.println("10'000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("##############################");

        // Challenge 3

        int count = 0;

        for (int i = 10; i < 50; i++)
        {
            System.out.println("Upper loop value is now " + i);
            if (isPrime(i))     // Move to isPrime method below.        // If false is returned back to here the code block below does not get run and the      // If true is returned here then the code block below gets run
            {                                                           // program returns to the first for loop with the value of 'i' now being 11.            // printing out the result, if the count of this happening
                System.out.println("Congratulations you have found a prime!");                                                                                  // reaches 3 the program exits this for loop by the command break.
                count++;                                                                                                                                        // If the count has not reached 3 the program iterates through this for loop
                System.out.println("Number " + i + " is a prime number");                                                                                       // increasing the value of 'i' by 1 each time.
                if (count == 3)
                {
                    System.out.println("Exiting the for loop");
                    break;
                }
            }
        }
    }
        //Challenge 3

    public static boolean isPrime(int primeCheckNum)
    {
        if (primeCheckNum == 1)                             //  Unless primeCheckNum is 1 this condition will always come back as false therefore never running the code block below.
        {
            return false;
        }

        for (int i = 2; i <= primeCheckNum / 2; i++)        // Each this for loop is entered when coming from outwith the method i.e. the code above
        {                                                   // the int variable i is set back to the value it was originally defined as i.e. 2.
            System.out.println("Lower loop value is now " + i);
            if (primeCheckNum % i == 0)                     // If this condition returns as true then the code block below gets run returning false back to where the isPrime method was called.
            {                                               // If this condition returns as false then the code block below does not get run and the program stays in the for loop iterating until
                                                            // the termination condition is met at which point the program exits the for loop and returns true back to where the isPrime method was called.
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest (double amount, double interestRate)
    {
        return (amount * (interestRate / 100));
    }
}

















