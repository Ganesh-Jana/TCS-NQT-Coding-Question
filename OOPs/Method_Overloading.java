package OOPs;
class calculate{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    float add(float a, float b){
        return a+b;
    }
}
public class Method_Overloading {
    public static void main(String[] args) {
    calculate c1 = new calculate();
        System.out.println(c1.add(2,3));
        System.out.println(c1.add(2,3,4));
        System.out.println(c1.add(2.3f, 1.4f));
    }
}
