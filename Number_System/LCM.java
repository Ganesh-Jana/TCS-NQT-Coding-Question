package Number_System;
import java.util.Scanner;
public class LCM {
    public static int gcd(int n1, int n2){
        while(n1>0 && n2>0){
            if(n1>n2) n1 = n1%n2;
            else n2 = n2%n1;
        }
        if(n1 == 0) return n2;
        else return n1;
    }
    public static int lcm(int n1, int n2){
        return (n1*n2)/gcd(n1,n2);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1 value: ");
       int n1 = sc.nextInt();
        System.out.println("enter n2 value: ");
        int n2 = sc.nextInt();
        System.out.println("LCM is : "+lcm(n1, n2));
    }
}
