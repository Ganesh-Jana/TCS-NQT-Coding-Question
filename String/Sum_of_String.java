package String;
public class Sum_of_String {
    public static int sumString(String st){
        int sum = 0;
        String temp = "";
        for(int i = 0; i<st.length(); i++){
            char ch = st.charAt(i);
            if(Character.isDigit(ch)){
                temp += ch;
            }else{
                if(!temp.equals("")){
                  sum += Integer.parseInt(temp);
                  temp = "";
                }
            }
        }
        if(!temp.equals("")){
            sum += Integer.parseInt(temp);
        }
        return sum;
    }
    public static void main(String[] args) {
        String st = "123n1n1n1";
        System.out.println(sumString(st));
    }
}
