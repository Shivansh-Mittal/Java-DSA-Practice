import java.util.*;

class SumOfNaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number:- ");
        num = sc.nextInt();
        sumOfNaturalNo(num);
        sc.close();
    }

    static void sumOfNaturalNo(int n){
        int sum = 0;
        for(int i=n;i>0;i--){
            sum = sum + i;
        }
        System.out.println(sum);
        return;
    }
}