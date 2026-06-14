package OOPs;
class animal{
    public void sound(){
        System.out.println("animal makes a sound");
    }
}
class dog extends animal{
    public void sound(){
        System.out.println("Dog barks");
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        animal a1 = new dog();
        a1.sound();
    }
}
