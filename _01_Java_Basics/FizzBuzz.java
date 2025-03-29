package _01_Java_Basics;

public class FizzBuzz {
    public static void calculate() {
        for (int i = 1; i <= 100; ++i) {
            if(i%3 ==0 && i%5 == 0) {
                System.out.println("FizzBuzz:");
                continue;
            } else if(i % 3 == 0)  {
                System.out.println("Fizz");
            } else if(i % 5 == 0)  {
                System.err.println("Buzz");
            }
            System.out.println(i);
        }
        
    }

    public static void main(String arg[]) {
        FizzBuzz.calculate();
    }
}