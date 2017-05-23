package com.javaweb.listener;

import java.util.Set;
import java.util.TreeSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionIdListener;
import javax.servlet.http.HttpSessionListener;


/**
 * Application Lifecycle Listener implementation class onlineUserList
 *
 */
@WebListener
public class OnlineUserList implements HttpSessionListener, HttpSessionAttributeListener, HttpSessionActivationListener, HttpSessionIdListener {
private ServletContext app=null;//用于application

    public OnlineUserList() {
        // TODO Auto-generated constructor stub
    }
    public void contextInitialized(ServletContextEvent arg0 ){
    	this.app=arg0.getServletContext();//取得application属性实例
    	this.app.setAttribute("online",new TreeSet());//设置空集合
    }
    
	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent paramHttpSessionEvent)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionIdListener#sessionIdChanged(HttpSessionEvent, String)
     */
    public void sessionIdChanged(HttpSessionEvent paramHttpSessionEvent, String paramString)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent event)  { 
         Set<?> all=(Set<?>) this.app.getAttribute("online"); //取出已有列表
         all.remove(event.getSession().getAttribute("userid"));//取出设置的内容
         this.app.setAttribute("online", all);//重新保存
    }

	/**
     * @see HttpSessionActivationListener#sessionDidActivate(HttpSessionEvent)
     */
    public void sessionDidActivate(HttpSessionEvent paramHttpSessionEvent)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent event)  { 
         @SuppressWarnings("unchecked")
		Set<Object> all=(Set<Object>) this.app.getAttribute("online");//取得已有列表
         all.add(event.getValue());  //增加新用户
         this.app.setAttribute("online", all);  //重新保存
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent event)  { 
        Set<?> all=(Set<?>) this.app.getAttribute("online");//取出已用列表
        all.remove(event.getValue());  //删除离开用户
        this.app.setAttribute("online", all);//重新保存
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent paramHttpSessionBindingEvent)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionActivationListener#sessionWillPassivate(HttpSessionEvent)
     */
    public void sessionWillPassivate(HttpSessionEvent paramHttpSessionEvent)  { 
         // TODO Auto-generated method stub
    }
	
}
