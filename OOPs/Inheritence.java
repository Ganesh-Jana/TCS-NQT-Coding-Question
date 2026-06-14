package OOPs;

class Employee{
    public void work() {
        System.out.println("Employee is working....");
    }
}
class Developer extends Employee{
    public void code(){
        System.out.println("Developer is coding...");
    }
}
public class Inheritence {
    public static void main(String[] args) {
        Developer d1 = new Developer();
        d1.code();
        d1.work();
    }
}
