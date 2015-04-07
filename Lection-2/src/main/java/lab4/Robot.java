package lab4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Ольга on 07.04.2015.
 */
@Component
public class Robot  {
    private Quoter quoter;

    @Autowired
    @QuoterQualifier(QuoterType.TERMINATOR)
    public void setQuoter(Quoter quoter){
        this.quoter = quoter;
    }

}
