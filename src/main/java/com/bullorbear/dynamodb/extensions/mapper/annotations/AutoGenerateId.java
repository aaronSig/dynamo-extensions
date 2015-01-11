package com.bullorbear.dynamodb.extensions.mapper.annotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/***
 * Decorate fields with this that should have their values auto generated on
 * save.
 */
@Retention(RUNTIME)
@Target(FIELD)
public @interface AutoGenerateId {

}
