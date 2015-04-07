package lab3;

/**
 * Created by Ольга on 07.04.2015.
 */
public abstract class SpeakingRobot implements Robot {

    private RandomQuoter quoter;

    public void setQuoter(RandomQuoter quoter) {
        this.quoter = quoter;
    }

    public String speak(){
        return quoter.getRandomQuoter();
    }
    public abstract RandomQuoter getQuoter();
}
