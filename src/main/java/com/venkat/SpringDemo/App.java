package com.venkat.SpringDemo;

import org.springframework.beans.factory.BeanFactory;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BeanFactory factory = new xmlBeanFactory(resource);
    	
        Alien obj = (Alien)factory.getBean("alien");
    }
}
