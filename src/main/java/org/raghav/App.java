package org.raghav;

import org.raghav.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Desktop dt = context.getBean(Desktop.class);
        dt.compile();

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml"); // this line create the container for me and applicationContext is an interface
//        Alien obj = applicationContext.getBean("alien",Alien.class);
////        obj.setAge(25); using this i am trying to override the property already set for age in the spring.xml
//        System.out.println(obj.getAge());
//        obj.code();
//
//        Desktop obj1 = applicationContext.getBean("com1",Desktop.class);
//
//        Computer com = applicationContext.getBean(Computer.class); // we are able to create bean for interface also because when you load the class interface class also get's loaded

    }
}
