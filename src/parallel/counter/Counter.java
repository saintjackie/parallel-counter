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
        for(long i = 0;i<100;i++){
            increaseValue();
            try {
                Thread.sleep(120);
            } catch (InterruptedException ex) {
            }
        }
    }
    
    private void increaseValue(){
        synchronized (LOCK) {
            if (value < 50) {
                value++;
                System.out.println(Thread.currentThread().getName() + " : " +  value);
            }
        }
    }
    
    
}
