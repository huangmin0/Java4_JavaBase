package com.javaweb.listener;

import java.io.UnsupportedEncodingException;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionIdListener;
import javax.servlet.http.HttpSessionListener;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * Application Lifecycle Listener implementation class OnlineUserList1
 *
 */
@WebListener
public class OnlineUserList1 implements HttpSessionListener, HttpSessionAttributeListener, HttpSessionActivationListener, HttpSessionIdListener, ServletContextListener, ServletContextAttributeListener {

	private ServletContext app=null;//用于application属性操作
    /**
     * Default constructor. 
     */
    public OnlineUserList1() {
        // TODO Auto-generated constructor stub
    }
    public void contextInitialized(ServletContextEvent arg0)  { //上下午初始化
       this.app=arg0.getServletContext();//取得servletContext实例
       this.app.setAttribute("online", new TreeSet() );//设置空集合
   }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    public void attributeRemoved(ServletContextAttributeEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionIdListener#sessionIdChanged(HttpSessionEvent, String)
     */
    public void sessionIdChanged(HttpSessionEvent arg0, String arg1)  { 
         // TODO Auto-generated method stub
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
    
	/**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     */
    public void attributeAdded(ServletContextAttributeEvent arg0)  { 
    }
	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         Set all=(Set) this.app.getAttribute("online");//取出已有列表
         if(all.size()>0){
        	 all.remove(arg0.getSession().getAttribute("userid"));//取出设置的内容
         }
         this.app.setAttribute("online", all);//重新保存
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
    public void attributeAdded(HttpSessionBindingEvent arg0)  { //增加session属性
        Set all=(Set) this.app.getAttribute("online");//取得已有列表
        String param=arg0.getName();
        if("userid".equals(param)){
       	 String name=(String) arg0.getValue();
       	 try
   		{
   			name=new String(name.getBytes("ISO-8859-1"),"UTF-8");
   		} catch (UnsupportedEncodingException e)
   		{
   			e.printStackTrace();
   		}
       	 all.add(name);//增加新用户
       	 this.app.setAttribute("online", all);//重新保存
        }else{
   			System.out.println("......增加的属性并不是userid！......");

        }
       }

    

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
         Set all=(Set)this.app.getAttribute("online");//取出已有列表
         String param=arg0.getName();
         if("userid".equals(param)){
        	 all.remove(arg0.getValue());//删除离开用户
        	 this.app.setAttribute("online",all );//重新保存
         }
    }

	/**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    public void attributeReplaced(ServletContextAttributeEvent arg0)  { 
         // TODO Auto-generated method stub
    }
	
}
