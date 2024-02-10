import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please Enter a number to check prime: ");
//        if (isPrime(scanner.nextInt())){
//            System.out.println("The given number is prime!!");
//        }else {
//            System.out.println("The given number is not prime !!");
//        }

//        if (checkPrime(scanner.nextInt())){
//            System.out.println("The given number is prime!!");
//        }else {
//            System.out.println("The given number is not prime !!");
//        }
        printAllPrimeOfAGivenNumber(scanner.nextInt());
        printAllPrimeNumberSieveWay(scanner.nextInt());

    }

    //time Complexity O(n)
//    private static boolean isPrime(int num){
//        for (int i=2;i<=num/2;i++){
//            if (num%i==0){
//                return false;
//            }
//        }
//        return true;
//    }
    //time Complexity O(sqrt(n))
    private static boolean isPrime(int num){
        for (int i=2;i<=Math.sqrt(num);i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }

    private static boolean checkPrime(int num){
        if (num==1){
            return false;
        }
        if (num==2 || num==3){
            return true;
        }
        if (num%2==0 || num%3==0){
            return false;
        }
        for (int i=5;i<=Math.sqrt(num)+1;i=i+6){
            if (num%i==0 || num%(i+2)==0){
                return false;
            }
        }
        return true;
    }

    private static void printAllPrimeOfAGivenNumber(int num){

        for (int i=2;i<=num;i++){
            if (checkPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    // time complexity of sieve O(squrtnlog(log(n)))
    private static void printAllPrimeNumberSieveWay(int num){
        boolean[] prime=new boolean[num+1];
        //i<=num
        for (int i=2;i<=Math.sqrt(num);i++){
            if (!prime[i]){
                //j=i*2
                for (int j=i*i;j<=num;j=j+i){
                    prime[j]=true;
                }
            }
        }

        for (int i=2;i<=num;i++){
            if (!prime[i]){
                System.out.println(prime[i]);
            }
        }
    }
}
