package String;

import java.util.Scanner;

public class Position_of_Substring {
    public static void main(String[] args) {
        System.out.println("Enter your String: ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(indexOfSubstring(str1, str2));
    }
    public static int indexOfSubstring(String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        for(int i = 0; i<=n-m; i++){
            int temp = i;
            int j = 0;
            for(j = 0; j<m; j++){
                if(str1.charAt(temp) != str2.charAt(j)){
                    break;
                }
                temp++;
            }
            if(j == m){
                return i;
            }
        }
        return -1;
    }
}
