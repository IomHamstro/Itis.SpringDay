package lab1; /**
 * Created by Ольга on 07.04.2015.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface DeprecatedOnSteroids {
    Class<?> replaceWith();
}
