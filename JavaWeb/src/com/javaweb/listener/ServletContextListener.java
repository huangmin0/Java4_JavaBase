package com.javaweb.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ServletContextListener
 *
 */
@WebListener
public class ServletContextListener implements javax.servlet.ServletContextListener, ServletContextAttributeListener {

    /**
     * Default constructor. 
     */
    public ServletContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     */
    public void attributeAdded(ServletContextAttributeEvent param)  { 
        System.out.println("ServletContextListener----attributeAdded");
        System.out.println("添加属性："+param.getName()+"-----"+param.getValue());
    }

	/**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    public void attributeRemoved(ServletContextAttributeEvent param)  { 
        System.out.println("ServletContextListener----attributeRemoved");
        System.out.println("删除username："+param.getName());
       
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent paramServletContextEvent)  { 
        System.out.println("ServletContextListener----contextDestroyed");

    }

	/**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    public void attributeReplaced(ServletContextAttributeEvent param)  { 
         System.out.println("ServletContextListener-----attributeReplaced");
         System.out.println("替换之前："+param.getName()+"-----"+param.getValue());
         System.out.println("替换之后："+param.getName()+"-----"+param.getServletContext().getAttribute(param.getName()));

    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent paramServletContextEvent)  { 
         System.out.println("ServletContextListener-----contextInitialized");
    }
	
}
