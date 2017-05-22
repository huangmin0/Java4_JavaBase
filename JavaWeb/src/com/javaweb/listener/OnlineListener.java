package com.javaweb.listener;

import java.util.Hashtable;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionIdListener;
import javax.servlet.http.HttpSessionListener;

import com.sun.javafx.collections.MappingChange.Map;

import javafx.beans.binding.StringBinding;

/**
 * Application Lifecycle Listener implementation class OnlineListener
 *
 */
@WebListener
public class OnlineListener implements HttpSessionListener, HttpSessionAttributeListener, HttpSessionActivationListener, HttpSessionIdListener {

    /**
     * Default constructor. 
     */
    public OnlineListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
         HttpSession session=se.getSession();
         ServletContext application=session.getServletContext();
         //获取session ID
         String sessionId=session.getId();
         //如果是一次新的会话
         if(session.isNew()){
        	 String user=(String)session.getAttribute("user");
        	 //未登录用户当游客处理
        	 user = (user == null ) ? "游客" : user;
        	 Map<String, String> online=(Map<String, String>)application.getAttribute("online");
        	 if(online==null){
        		 online=(Map<String, String>) new Hashtable<String,String>();
        	 }
        	 //将用户在线信息放入Map中
        	 ((Hashtable<String, String>) online).put(sessionId,user);
        	 application.setAttribute("online", online);
         }
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
    //当用户与服务器之间Session断开时触发该方法
    public void sessionDestroyed(HttpSessionEvent se)  { 
         HttpSession session=se.getSession();
         ServletContext application=session.getServletContext();
         String sessionId=session.getId();
         Map<String, String> online=(Map<String, String>)application.getAttribute("online");
         if(online!=null){
        	 //删除该用户的在线信息
        	 ((Hashtable<String, String>) online).remove(sessionId);
         }
         application.setAttribute("online", online);
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
    public void attributeAdded(HttpSessionBindingEvent paramHttpSessionBindingEvent)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent paramHttpSessionBindingEvent)  { 
         // TODO Auto-generated method stub
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
