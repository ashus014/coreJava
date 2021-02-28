
class Counter{
    int count;
    public synchronized void increment(){ //synchronized keywork is used here to make the access synchronized
        count++;
    }
}
public class Sync {
    public static void main(String[] args) throws Exception {
        
        Counter obj1 = new Counter();
        Runnable run1 = new Runnable()
                                {
                                    public void run()
                                    {
                                        for(int i=0;i<1000;i++){
                                            obj1.increment();
                                        }
                                    }
                                };
        
        Runnable run2 = new Runnable()
                                {
                                    public void run()
                                    {
                                        for(int i=0;i<1000;i++){
                                                obj1.increment();
                                        }
                                    }
                                };

        Thread t1 = new Thread(run1);
        Thread t2 = new Thread(run2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(obj1.count);
    }
}
