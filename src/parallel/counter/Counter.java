package parallel.counter;

/**
 * Parallel counter, thread safe, counting from 0 to 50
 * @author Jakub Holy
 */
public class Counter implements Runnable{
    
    private static final Object LOCK = new Object();
    private static int value = -1;

    @Override
    public void run() {
        
        while(true){
            for(long l=0;l<100000000l;l++);
            synchronized (LOCK) {
            if (value >= 50)
                break;
                value++;
                System.out.println(Thread.currentThread().getName() + " : " +  value);
            
        }
            for(long l=0;l<10000000l;l++);
        }
    }
    
    private void increaseValue(){
        
    }
    
    
}
