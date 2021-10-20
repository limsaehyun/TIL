import sun.util.resources.cldr.ak.LocaleNames_ak;

import java.time.LocalTime;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class callableExample1 {

    static class MyCallable implements Callable<String> {
        @Override
        public String call() throws Exception {
            return "Called at" + LocalTime.now();
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable callable = new MyCallable();
        FutureTask futureTask = new FutureTask(callable);
        Thread thread = new Thread(futureTask);
        thread.start();

        System.out.println("result : " + futureTask.get());

    }
}
