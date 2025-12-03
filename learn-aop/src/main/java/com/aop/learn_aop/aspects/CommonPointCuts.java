package com.aop.learn_aop.aspects;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonPointCuts {
	@Pointcut("execution(* com.aop.learn_aop.business.*.*(..))")
    public void businessPackageConfig() {}

    // Match all methods in the data package
    @Pointcut("execution(* com.aop.learn_aop.data.*.*(..))")
    public void dataPackageConfig() {}

    // Combine both for convenience
    @Pointcut("com.aop.learn_aop.aspects.CommonPointCuts.businessPackageConfig() || com.aop.learn_aop.aspects.CommonPointCuts.dataPackageConfig()")
    public void businessAndDataPackageConfig() {}

    // Match beans whose names contain 'Service'
    @Pointcut("bean(*Service*)")
    public void allPackageConfigUsingBean() {}
    
    @Pointcut("@annotation(/learn-aop/src/main/java/com/aop/learn_aop/business/TrackTime.java))")
    public void trackTimeAnnotation() {}
}

