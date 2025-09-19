package org.raghav;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml"); // this line create the container for me
        Alien obj = (Alien) applicationContext.getBean("alien");
        obj.code();
    }
}
