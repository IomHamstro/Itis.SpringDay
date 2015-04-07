package lab05;

/**
 * Created by Ольга on 06.04.2015.
 */
public class BenchmarkProxySubject implements Subject {

    Subject realSubject;

    public BenchmarkProxySubject(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void longMethod() {
        long start = System.currentTimeMillis();
        realSubject.longMethod();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}