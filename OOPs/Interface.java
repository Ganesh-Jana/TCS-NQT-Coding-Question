package OOPs;
interface payment{
    void pay(double amount);
}
class CreditCardPayment implements payment{
    public void pay(double amount){
        System.out.println("paid "+ amount + "using credit card");
    }
}
class UPI implements payment{
    public void pay(double amount){
        System.out.println("paid" + amount + "using UPI");
    }
}
public class Interface {
    public static void main(String[] args) {
        payment p1 = new CreditCardPayment();
        payment p2 = new UPI();
        p1.pay(1000);
        p2.pay(200);
    }
}
