package lesson03;

public class Fibonacci {
    public static void printFibonacciNumbers(int quantity){

        if (quantity < 1) System.out.println("Please enter a positive number more than 0");
        else {
            long p = 0;  // p is for previous number
            long c = 1;  // c is for current number
            long n;      // n is for next number

            StringBuilder r = new StringBuilder();  // resulting string

            for (int i = 0; i < quantity; i++){
                r.append(p).append(",");

                n = c + p;
                p = c;
                c = n;
            }
            System.out.println(
                    r.replace(r.length()-1, r.length(),";") // replacing last comma with semicolon
            );
        }
    }
}
