public class BreakThread implements Runnable{
    private boolean canBreak = false;

    private final int sleep_time;

    public BreakThread(int sleep_time) {
        this.sleep_time = sleep_time;
    }


    @Override
    public void run() {
        try {
            Thread.sleep(sleep_time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        canBreak = true;
    }

    synchronized public boolean isCanBreak() {
        return canBreak;
    }
}