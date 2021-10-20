import java.time.LocalTime;

public class ThreadRunnable2 {

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            String result = "Called at " + LocalTime.now();
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
