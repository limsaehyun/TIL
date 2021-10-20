import java.time.LocalTime;

public class ThreadRunnableRamda {
    public static void main(String[] args) {
        new Thread(() ->
                System.out.println("Runnable at " + LocalTime.now())
        ).start();
    }
}
