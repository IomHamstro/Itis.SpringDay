package lab01;

/**
 * Created by Ольга on 06.04.2015.
 */
public class Robot {

    @Override
    public String toString() {
        return "I'm Robot!";
    }

    @RunThisMethod(repeat = 10)
    public void clean(){
        System.out.print("Clean!");
    }
}
