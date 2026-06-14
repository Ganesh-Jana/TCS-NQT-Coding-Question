package OOPs;
class Test implements Runnable{
    public void run(){
        for(int i = 0; i<5; i++){
            System.out.println(Thread.currentThread().getName()+ ":"+ i);
        }
    }
}
public class Multithread_Using_Runnable {
    public static void main(String[] args) {
   Test t1 = new Test();
   Thread th1 = new Thread(t1);
   Thread th2 = new Thread(t1, "THread B");
   th1.start();
   th2.start();
    }
}
