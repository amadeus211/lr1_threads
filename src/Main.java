import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        double step = 0.000001;
        int count_of_treads = 7;

        for(int i=0; i<count_of_treads; i++){
            BreakThread breakThread = new BreakThread(random.nextInt(9001) + 1000);
            new MainThread(i, step, breakThread).start();
            new Thread(breakThread).start();
        }
    }
}
