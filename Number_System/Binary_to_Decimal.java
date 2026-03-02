package Number_System;

public class Binary_to_Decimal {
    public static void main(String[] args) {
        String binary = "1010";
        int decimal = 0;
        for(int i = 0; i<binary.length(); i++){
            decimal = (decimal << 1) + (binary.charAt(i) - '0');
        }
        System.out.println(decimal);
    }
}
