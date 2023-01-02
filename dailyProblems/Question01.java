package dailyProblems;
import java.util.*;
import java.lang.*;
import java.io.*;

/*Banker and Stocks
An investment banker has a tradition to decide what action they want to take on a certain day. The banker decides any of the three actions based on the price of the stock on that day: Buy, Sell or Pass. If the price of the stock has more even number of positive divisors the banker BUYS the stock. If the price of the stock has more odd number of positive divisors, the banker SELLS the stock. If the Price of the stock has equal number of odd and even divisors decides to PASS on the stock; you will be given the price of the stock, which will help the banker decide if they should buy, sell or pass on the stock.

Constraints
All values in input are integers.
0 <= input integer < 1018
Input Format
Integer (possibly very large): price of the stock.

Output Format
String: SELL if there are more positive odd divisors, BUY if there are more positive even divisors, and PASS if there are the same number of odd positive and even positive divisors.
Do not print debugging Statements while submitting the solution.

Examples
Input            |   Output 
2                |   PASS           
832483274807     |   SELL
100000000000     |   BUY */

public class Question01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n=Long.parseLong(br.readLine());
        String answer=solution(n);
        System.out.println(answer);
    }

    public static String solution(long n) {
        // Write solution here
        if(n==0){
            return "PASS";
        }
        int even=0, odd=0;
        for (long i = 1; i <= Math.sqrt(n); i++) {
            if(n%i==0) {
                long quotient = n/i;
                if(quotient%2==0){
                    even++;
                } else {
                    odd++;
                }

                if(i%2==0){
                    even++;
                } else {
                    odd++;
                }
            }
        }

        if(even>odd){
            return "BUY";
        } else if(even<odd){
            return "SELL";
        } else{
            return "PASS";
        }
    }
}