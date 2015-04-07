package lab3;

import java.util.Random;

/**
 * Created by Ольга on 07.04.2015.
 */
public class RandomQuoter {
    private String randomQuoter;

    public RandomQuoter() {
        randomQuoter = Integer.toHexString( new Random().nextInt());
    }

    public String getRandomQuoter(){
        return randomQuoter;
    }
}
