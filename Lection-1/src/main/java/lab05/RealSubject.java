package lab05;

import lab07.Benchmark;

/**
 * Created by Ольга on 06.04.2015.
 */
public class RealSubject implements Subject {
    @Override
    @Benchmark
    public void longMethod() {
        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
