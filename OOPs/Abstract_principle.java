package OOPs;

abstract class TV{
    abstract void turnOn();
}
class samsung extends TV{
    public void turnOn(){
        System.out.println("Samsung Tv is on..");
    }
}
public class Abstract_principle {
    public static void main(String[] args) {
        TV t1 = new samsung();
        t1.turnOn();
    }
}
