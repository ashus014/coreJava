
public class LambdaUsingRunnableDemo {
     public static void main(String[] args) throws Exception{
        Runnable obj1 = () ->
                            {
                                for(int i=0;i<5;i++){   
                                    System.out.println("Hi");      
                                    try{
                                        Thread.sleep(500);
                                    }
                                    catch(Exception e){}
                                }    
                            };
        Runnable obj2 = () ->
                            {
                                for(int i=0;i<5;i++){   
                                    System.out.println("Hello");      
                                    try{
                                        Thread.sleep(500);
                                    }
                                    catch(Exception e){}
                                }     
                            };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.setName("Hi Thread");
        t2.setName("Hello Thread");
        System.out.println(t1.getName()); //Here we are naming threads
        System.out.println(t2.getName());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("This is Bye Bye");
     }
}
