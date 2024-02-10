import java.util.Scanner;

public class DivisorsOfANumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to divisors of a number");
        System.out.print("Please enter a number: ");
        //findDivisorsOfNumber(scanner.nextInt());
        //findEfficentDivisorsOfNumber(scanner.nextInt());
        findEfficentDivisorsOfNumberAscOrder(scanner.nextInt());
    }

    // time complexity O(n)
    public static void findDivisorsOfNumber(int num){
        System.out.println("The divisors of the given number are: ");
        for (int i=1;i<=num;i++){
            if (num%i==0){
                System.out.print(" "+i);
            }
        }
    }

    // time complexity O(root(n))
    public static void findEfficentDivisorsOfNumber(int num){
        System.out.println("The divisors of the given number are: ");
        for (int i=1;i<=Math.sqrt(num);i++){
            if (num%i==0){
                System.out.print(" "+i);
                if (i!=(num/i)) System.out.print(" "+(num/i));
            }
        }
    }

    // time complexity O(root(n))
    public static void findEfficentDivisorsOfNumberAscOrder(int num){
        System.out.println("The divisors of the given number are: ");
        int i=0;
        for (i=1;i<=Math.sqrt(num);i++){
            if (num%i==0){
                System.out.print(" "+i);
            }
        }
        for (;i>=1;i--){
            if (num%i==0 && i!=num/i){
                System.out.print(" "+(num/i));
            }
        }
    }
}
