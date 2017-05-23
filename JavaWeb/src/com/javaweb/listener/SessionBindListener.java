package com.javaweb.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * Application Lifecycle Listener implementation class SessionBindListener
 *
 */
@WebListener
public class SessionBindListener implements HttpSessionBindingListener {
private String name;


    public SessionBindListener()
{
	super();
}

	public SessionBindListener(String name)
	{
		super();
		this.name = name;
	}

	public void valueBound(HttpSessionBindingEvent arg0)  { 
    	System.out.println("ValueBound:"+arg0.getName()+"-----"+arg0.getValue());
    }

    public void valueUnbound(HttpSessionBindingEvent arg0)  { 
        System.out.println("ValueUnbound:"+arg0.getName());
    }

	@Override
	public String toString()
	{
		return "SessionBindListener [name=" + name + "]";
	}
    
	
}
