package lambda;

/**
 * Created by sasi-kathimanda on 17/12/16.
 */
public class Sample {
    public static void main(String[] args) {

        // HIGH CEREMONY CODE : using Anonymous function
        Thread th   = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("In Other Thread");
            }
        });
        th.start();
        System.out.println("In main");


        //Here Comes LAMBDA
        Thread th2 = new Thread(() -> System.out.println("In Other Thread"));
        th2.start();
    }
}
