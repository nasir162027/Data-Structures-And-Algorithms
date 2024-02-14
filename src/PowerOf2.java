import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter a number to check power of 2: ");
        System.out.println("The given number power of 2 is: "+powerOf2(scanner.nextInt()));
    }

    public static boolean powerOf2(int n){
        if (n==0){
            return false;
        }
        return (n & (n-1))==0;
    }
}
