package lab1;

import java.lang.annotation.Annotation;

/**
 * Created by Ольга on 07.04.2015.
 */
public class DeprecatedNewStuff implements DeprecatedOnSteroids {
    @Override
    public Class<?> replaceWith() {
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return DeprecatedOnSteroids.class;
    }
}
