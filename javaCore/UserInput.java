package javaCore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException {
        // InputStreamReader is = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(is);

        // int n = Integer.parseInt(br.readLine());
        // System.out.println(n);
        // br.close();
        int n;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        n = sc.nextInt();
        System.out.println(s + n);
        sc.close();
    }
}
