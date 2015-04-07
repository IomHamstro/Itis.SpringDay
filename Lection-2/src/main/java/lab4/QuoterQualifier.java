package lab4;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Ольга on 07.04.2015.
 */
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface QuoterQualifier{
        QuoterType value();
        }
