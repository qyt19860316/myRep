package org.sunnyframework.core.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 
 * @author  sunyard
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface JeecgEntityTitle {
	  String name();
}
