package com.javaweb.listener;

import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

/**
 * Application Lifecycle Listener implementation class RequestListener
 *
 */
@WebListener
public class RequestListener implements ServletRequestListener, ServletRequestAttributeListener, AsyncListener {

    /**
     * Default constructor. 
     */
    public RequestListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see AsyncListener#onComplete(AsyncEvent)
     */
    public void onComplete(AsyncEvent paramAsyncEvent) throws java.io.IOException { 
         System.out.println("RequestListener----onComplete");
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent paramServletRequestEvent)  { 
         System.out.println("RequestListener----requestDestroyed");
    }

	/**
     * @see ServletRequestAttributeListener#attributeRemoved(ServletRequestAttributeEvent)
     */
    public void attributeRemoved(ServletRequestAttributeEvent arg0)  { 
         System.out.println("RequestListener----attributeRemoved");
         System.out.println("删除属性:"+arg0.getName());
    }

	/**
     * @see AsyncListener#onError(AsyncEvent)
     */
    public void onError(AsyncEvent paramAsyncEvent) throws java.io.IOException { 
         System.out.println("RequestListener----onError");
    }

	/**
     * @see AsyncListener#onStartAsync(AsyncEvent)
     */
    public void onStartAsync(AsyncEvent paramAsyncEvent) throws java.io.IOException { 
         System.out.println("RequestListener-----onStartAsync");
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent paramServletRequestEvent)  { 
         System.out.println("RequestListener----requestInitialized");
    }

	/**
     * @see ServletRequestAttributeListener#attributeAdded(ServletRequestAttributeEvent)
     */
    public void attributeAdded(ServletRequestAttributeEvent arg0)  { 
         System.out.println("RequestListener----attributeAdded");
         System.out.println(arg0.getName()+"----"+arg0.getValue());
    }

	/**
     * @see AsyncListener#onTimeout(AsyncEvent)
     */
    public void onTimeout(AsyncEvent paramAsyncEvent) throws java.io.IOException { 
         System.out.println("RequestListener----onTimeout");
    }

	/**
     * @see ServletRequestAttributeListener#attributeReplaced(ServletRequestAttributeEvent)
     */
    public void attributeReplaced(ServletRequestAttributeEvent arg0)  { 
         System.out.println("RequestListener----attributeReplaced");
         System.out.println("替换之前："+arg0.getName()+"----"+arg0.getValue());
         System.out.println("替换之后："+arg0.getName()+"----"+arg0.getServletRequest().getAttribute(arg0.getName()));
       
    }
	
}
