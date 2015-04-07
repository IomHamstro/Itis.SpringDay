package lab02;

import java.util.List;

/**
 * Created by Ольга on 06.04.2015.
 */
public class TerminatorQuoter implements Quoter {

    private List<String> quotes;

    @Override
    public void sayQuote() {
       for(String q : quotes){
           System.out.println(q);
       }
    }

    public void setQuotes(List<String> quotes) {
        this.quotes = quotes;
    }
}
