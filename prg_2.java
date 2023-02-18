import java.util.Scanner;

public class prg_2 {
    public static void main(String args[]) {
        int num1, num2, num3, num4, num5, sum;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = s.nextInt();
        System.out.print("Enter the second number: ");
        num2 = s.nextInt();
        System.out.print("Enter the third number: ");
        num3 = s.nextInt();
        System.out.print("Enter the forth number: ");
        num4 = s.nextInt();
        System.out.print("Enter the fifth number: ");
        num5 = s.nextInt();
        sum =sum(num1,num2,num3,num4,num5);
        System.out.println("The sum of all five no is: " + sum);
    }

    // method that calculates the sum
    public static int sum(int num1, int num2, int num3, int num4, int num5) 
    {
        int sum = num1+num2+num3+num4+num5;
        return sum;
    }
}