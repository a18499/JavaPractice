import java.util.concurrent.*;

/**
 * Created by a1849 on 2016/3/22.
 */
public class Mutithread implements Callable<Integer> {

    public Integer call() throws Exception {
        int i = 0;
        for(;i<1000000;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
        return i;
    }
    public static void main(String args[]){
        System.out.println("Test");
        ExecutorService executor = Executors.newCachedThreadPool();
        Mutithread test = new Mutithread();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(test);
        executor.submit(futureTask);
        executor.submit(futureTask);
        executor.shutdown();
        try {
            System.out.println("taskresult"+futureTask.get());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
