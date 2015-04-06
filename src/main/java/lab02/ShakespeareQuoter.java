package lab02;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.Override;import java.lang.String;import java.lang.System;import java.util.List;

/**
 * Created by Ольга on 06.04.2015.
 */
public class ShakespeareQuoter implements Quoter {

    private String quote;

    @Override
    public void sayQuote() {
        System.out.println(quote);
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
