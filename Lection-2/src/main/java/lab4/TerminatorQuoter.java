package lab4;

import org.springframework.stereotype.Component;

import java.util.Queue;

/**
 * Created by Ольга on 07.04.2015.
 */
@Component
@QuoterQualifier(QuoterType.TERMINATOR)
public class TerminatorQuoter implements Quoter {
    @Override
    public String sayQuote() {
        return "I'll be back";
    }
}
