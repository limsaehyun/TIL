public class ThreadTest2 extends Thread {
    int seq;

    public ThreadTest2(int seq) {
        this.seq = seq;
    }

    public void run() {
        System.out.println(this.seq + "thread start.");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
        System.out.println(this.seq + "thread end.");
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            Thread t = new ThreadTest2(i);
            t.start();
        }
        System.out.println("main end.");
    }
}
