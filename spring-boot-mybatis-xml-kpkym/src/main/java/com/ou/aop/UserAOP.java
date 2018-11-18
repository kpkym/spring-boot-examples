package com.ou.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author kpkym
 * Date: 2018-11-03 20:41
 */
@Slf4j
@Aspect
@Component
public class UserAOP {

    @Before("execution(* com.ou..*(..))")
    public void before() {
        log.info("BEFORE");
    }
}
