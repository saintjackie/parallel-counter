package parallel.counter;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Testing counter with 3 threads.
 * @author Jakub Holy
 */
public class Main {

    public static void main(String[] args) {
        
//        Executor executor = Executors. newCachedThreadPool();
//        
//        executor.execute(new Counter());
//        executor.execute(new Counter());
//        executor.execute(new Counter());
        
        Thread t1 = new Thread(new Counter());
        t1.setName("Vlakno 1");
        Thread t2 = new Thread(new Counter());
        t2.setName("Vlakno 2");
        Thread t3 = new Thread(new Counter());
        t3.setName("Vlakno 3");
        
        t1.start();
        t2.start();
        t3.start();
        
    }
    
}
