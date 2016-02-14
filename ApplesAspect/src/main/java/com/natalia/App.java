package com.natalia;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Natalia
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
        IApple apple =  (IApple) context.getBean("appleBean");
        apple.green();
		System.out.println();
		apple.red();
    }
}
