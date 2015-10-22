package org.pcsworld.springtest.lecture5;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("org/pcsworld/springtest/lecture5/beans/beans.xml");
        Person person = (Person)context.getBean("person");
        person.speak();
        ((ClassPathXmlApplicationContext)context).close();
    }
}
