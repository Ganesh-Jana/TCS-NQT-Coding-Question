package Number_System;

public class reverse_digit_string {
    public static String reverse(String n){
        StringBuilder st = new StringBuilder(n);
         st.reverse();
         int i = 0;
         while(i<st.length() && st.charAt(i) == '0'){
             i++;
         }
         return (i == st.length())? "0" : st.substring(i);
    }

    public static void main(String[] args) {
        String n = "010400";
        System.out.println("The reverse is:" +reverse(n));
    }
}
