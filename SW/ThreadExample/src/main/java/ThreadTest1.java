public class ThreadTest1 extends Thread {
    public void run() {
        System.out.println("thread run");
    }

    public static void main(String[] args) {
        ThreadTest1 threadTest1 = new ThreadTest1();
        threadTest1.start();
    }
}
