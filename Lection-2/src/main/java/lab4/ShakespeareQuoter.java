package lab4;

import org.springframework.stereotype.Component;

/**
 * Created by Ольга on 07.04.2015.
 */
@Component
@QuoterQualifier(QuoterType.SHAKEPEARE)
public class ShakespeareQuoter implements Quoter{
    @Override
    public String sayQuote() {
        return "2b|!2b";
    }
}
