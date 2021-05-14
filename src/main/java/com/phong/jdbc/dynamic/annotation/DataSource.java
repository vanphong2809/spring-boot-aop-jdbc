package com.phong.jdbc.dynamic.annotation;

import com.phong.jdbc.dynamic.DataSourceType;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
@Inherited
public @interface DataSource {

    /**
     * Database routing
     */
    DataSourceType value() default DataSourceType.MASTER;
}