package com.javaweb.listener;

import java.io.UnsupportedEncodingException;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionIdListener;
import javax.servlet.http.HttpSessionListener;

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;
import com.sun.org.apache.bcel.internal.generic.NEW;

import sun.reflect.generics.tree.Tree;

/**
 * Application Lifecycle Listener implementation class OnlineUserListDemo
 *
 */
@WebListener
public class OnlineUserListDemo implements HttpSessionListener, HttpSessionAttributeListener, HttpSessionActivationListener, HttpSessionIdListener, ServletContextListener {
private ServletContext app=null;
    /**
     * Default constructor. 
     */
    public OnlineUserListDemo() {
        // TODO Auto-generated constructor stub
    }
    public void contextInitialized(ServletContextEvent arg0)  { 
       this.app=arg0.getServletContext();
      this.app.setAttribute("online", new TreeSet());
   }
	
	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionIdListener#sessionIdChanged(HttpSessionEvent, String)
     */
    public void sessionIdChanged(HttpSessionEvent arg0, String arg1)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         Set all=(Set) app.getAttribute("online");
         if(all.size()>0){
        	 all.remove(arg0.getSession().getAttribute("userid"));
        	 this.app.setAttribute("online", all);
         }
    }

	/**
     * @see HttpSessionActivationListener#sessionDidActivate(HttpSessionEvent)
     */
    public void sessionDidActivate(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
        Set all=(Set) app.getAttribute("online");
        String param=arg0.getName();
        if("userid".equals(param)){
        	String name=(String) arg0.getValue();
        	try
			{
				name=new String(param.getBytes("ISO-8859-1"), "UTF-8");
			} catch (UnsupportedEncodingException e)
			{
				e.printStackTrace();
			}
        	all.add(name);
        	this.app.setAttribute("online", all);
        }else{
        	System.out.println("增加属性并不是userid");
        }
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
         Set all=(Set) app.getAttribute("online");
         String param=arg0.getName();
         if("userid".equals(param)){
        	 all.remove(arg0.getValue());
        	 this.app.setAttribute("online", all);
         }
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionActivationListener#sessionWillPassivate(HttpSessionEvent)
     */
    public void sessionWillPassivate(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    
}
