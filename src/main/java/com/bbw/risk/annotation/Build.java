package com.bbw.risk.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.TYPE })
@Documented
public @interface Build {
	/**
	 * 标签名
	 * 
	 * @return
	 */
	String tag() default "";

	/**
	 * 描述
	 * 
	 * @return
	 */
	String desc() default "";

	/**
	 * 字典
	 * 
	 * @return
	 */
	String dic() default "";

	/**
	 * 列明
	 * 
	 * @return
	 */
	String column() default "";

	/**
	 * 默认值
	 * 
	 * @return
	 */
	String value() default "";
/**
 * 报表号
 * @return
 */
	String number() default "";
}
