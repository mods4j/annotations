package io.github.mods4j;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.SOURCE;

/**
 * Indicates that the annotated element (and its enclosing elements) should not have any mod applied.
 */
@Retention(SOURCE)
@Target({METHOD, PARAMETER, TYPE})
public @interface SuppressMods {
}
