package Arrays;

public class Add_Value_Any_Positions {
    public static int[] addValue(int[] arr, int val, int pos){
        int[] newArr = new int[arr.length+1];
        for(int i = 0; i<pos-1; i++){
            newArr[i] = arr[i];
        }
        newArr[pos-1] = val;
        for(int i = pos; i<newArr.length; i++){
            newArr[i] = arr[i-1];
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int val = 6, pos = 3;
        arr = addValue(arr,val,pos);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
