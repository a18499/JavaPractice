import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by a1849 on 2016/3/23.
 */
public class Blockqueue {
    public static void main(String [] args){
        BlockingQueue<String> test = new ArrayBlockingQueue<String>(2);
        try {
            test.put("JAVA");
            test.put("JAVA");
            System.out.print("Size"+test.size());
            test.put("JAVA");


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
