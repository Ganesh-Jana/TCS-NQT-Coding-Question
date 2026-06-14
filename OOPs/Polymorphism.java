package OOPs;
class shape{
    public void draw(){
        System.out.println("Drawing shape..");
    }
}
class circle extends shape{
    public void draw(){
        System.out.println("Drawing circle..");
    }
}
class rectangle extends shape{
    public void draw(){
        System.out.println("Drawing rectangle..");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        shape s1 = new circle();
        shape s2 = new rectangle();
        s2.draw();
        s1.draw();
    }
}
