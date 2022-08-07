import java.util.*;

class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start, end;
        System.out.println("Enter start number:- ");
        start = sc.nextInt();
        System.out.println("Enter last number:- ");
        end = sc.nextInt();
        printPrime(start, end);
        sc.close();
    }

    static void printPrime(int start, int end){
        if(end<start){
            System.out.println("-1");
            return;
        }
        for(int i=start;i<=end;i++){
            if(checkPrime(i)){
                System.out.println(i);
            }
        }
        return;
    }

    static boolean checkPrime(int num){
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0)
                return false;
        }
        return true;
    }

}