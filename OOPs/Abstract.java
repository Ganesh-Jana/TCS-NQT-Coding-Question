package OOPs;

abstract class vehicle{
    public void start(){  // concrete method
        System.out.println("vehicle is starting..");
    }
    abstract void drive();  // Abstract Method
}
class car extends vehicle{
    void drive(){
        System.out.println("Car is driving...");
    }
}
public class Abstract {
    public static void main(String[] args) {
       vehicle v1 = new car();
       v1.start();
       v1.drive();
    }

}
