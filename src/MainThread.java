public class MainThread extends Thread{
    private final int id;
    private final double step;
    private final BreakThread breakThread;
    public int count_of_operations = 0;

    public MainThread(int id,double step, BreakThread breakThread) {
        this.id = id;
        this.step = step;
        this.breakThread = breakThread;
    }

    @Override
    public void run() {
        double sum = 0;
        boolean isStop = false;
        do{
            sum+=step;
            count_of_operations++;
            isStop = breakThread.isCanBreak();
        } while (!isStop);
        System.out.println(id + " - " + sum + " || count of operations: " + count_of_operations);
    }
}