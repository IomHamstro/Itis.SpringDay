package lab03;

import lab02.Quoter;
import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Ольга on 06.04.2015.
 */
public class TalkingRobot implements Robot {

    List<Quoter> quoters;

    @Override
    @PostConstruct
    public void talk() {
        System.out.println("I'm robot "+ toString());
        for(Quoter quoter : quoters){
            quoter.sayQuote();
        }
    }
    public void setQuoters(List<Quoter> quoters) {
        this.quoters = quoters;
    }
}
