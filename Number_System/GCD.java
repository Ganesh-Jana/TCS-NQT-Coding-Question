package Number_System;

public class GCD {
    public static int gcd(int n1, int n2){
        while(n1>0 && n2>0){
            if(n1>n2) n1 = n1%n2;
            else n2 = n2%n1;
        }
        if(n1 == 0) return n2;
        else return n1;
    }

    public static void main(String[] args){
        int n1 = 15, n2 = 20;
        System.out.println("The GCD value is: "+gcd(n1, n2));
    }
}
