/**
 * Created by a1849 on 2016/3/24.
 */
public class Singlethread {
    public static void main(String args[]){
        for (int i=0;i<1000000;i++){
            System.out.print("Thread i= "+i);
        }
        for (int i=0;i<1000000;i++){
            System.out.print("Thread i= "+i);
        }
    }
}
