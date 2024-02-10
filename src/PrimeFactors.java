import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to prime factor");
        System.out.print("Please enter a number: ");
       // findPrimeFactor(scanner.nextInt());
        findPrimeFactorEfficent(scanner.nextInt());

    }

    private static void findPrimeFactor(int num){
        System.out.print("Prime Factors of the given numbers are: ");
            int i=2;
            while (num>1){
            while (num%i==0){
                System.out.print(" "+i);
                num=num/i;
            }
            i++;
        }
    }
    //time complexity O(sqrt(n(log(n))))

    private static void findPrimeFactorEfficent(int num){
        System.out.print("Prime Factors of the given numbers are: ");
        int i=2;
        while (i<=Math.sqrt(num)){
            while (num%i==0){
                System.out.print(" "+i);
                num=num/i;
            }
            i++;
        }
        if (num>1) System.out.println(" "+num);
    }
}
