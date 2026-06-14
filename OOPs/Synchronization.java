package OOPs;

class  counter{
    int count = 0;
    public synchronized void increment(){
        count++;
    }

}
class Task extends Thread{
    counter c1;
    public Task (counter c1){
        this.c1 = c1;
    }
    public void run(){
        for(int i = 0; i<1000; i++) {
            c1.increment();
        }
    }
}
public class Synchronization {
    public static void main(String[] args) throws InterruptedException {
        counter c1 = new counter();
        Task th = new Task(c1);
        Task th2 = new Task(c1);
        th.start();
        th2.start();
        th.join();
        th2.join();
        System.out.println("count : " + c1.count);
    }
}
