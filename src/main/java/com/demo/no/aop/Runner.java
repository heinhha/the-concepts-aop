package com.demo.no.aop;

import com.demo.no.aop.action.ComplexReportAction;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();

        ComplexReportAction complexReportAction = context.getBean(ComplexReportAction.class);
        complexReportAction.perform();
    }
}