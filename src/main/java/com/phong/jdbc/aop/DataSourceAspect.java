package com.phong.jdbc.aop;

import com.phong.jdbc.dynamic.DynamicDataSourceHolder;
import com.phong.jdbc.dynamic.annotation.DataSource;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DataSourceAspect implements Ordered {

//    @Pointcut("execution(public * com.aop.jdbc.impl..*.*(..))")
//    public void dynamic() {
//
//    }


    @Before(value = "@annotation(dataSource)")
    public void dataSourcePoint(JoinPoint joinPoint, DataSource dataSource) {
        DynamicDataSourceHolder.putDataSource(dataSource.value());
    }

    @Override
    public int getOrder() {
        return -1;
    }
}
