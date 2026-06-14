package OOPs;

class BankAccout{
    private double balance;
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }
    public void withdrow(double amount){
        if(amount <= balance){
            balance -= amount;
        }
    }
    public double getBalance(){
        return balance;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        BankAccout b1 = new BankAccout();
        b1.deposit(1000);
        System.out.println(b1.getBalance());
        b1.withdrow(100);
        System.out.println(b1.getBalance());
    }
}
