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

        Alien obj = context.getBean(Alien.class);
        System.out.println(obj.getAge());
        obj.code();

//        Desktop dt = context.getBean(Desktop.class); // created desktop object dt
//
//        Desktop dt1 = context.getBean(Desktop.class); // created desktop object dt1 but still we are not creating this object as bean is singleton.
//
//        dt.compile();
//        dt1.compile();

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
