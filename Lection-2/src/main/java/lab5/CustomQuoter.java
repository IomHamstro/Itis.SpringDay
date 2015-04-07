package lab5;

import lab4.Quoter;

/**
 * Created by Ольга on 07.04.2015.
 */
public class CustomQuoter implements Quoter {
    public StringBuilder stringBuilder;

    public CustomQuoter(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    @Override
    public String sayQuote() {
        return stringBuilder.toString();
    }
}
